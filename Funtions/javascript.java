import java.u l.*;
import java.u l.Base64;
import java.io.BuﬀeredReader;
import java.io.InputStreamReader;
import java.security.spec.KeySpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
public class DESAlgorithm {
private sta c final String UNICODE_FORMAT = "UTF8";
public sta c final String DES_ENCRYPTION_SCHEME = "DES";
private KeySpec myKeySpec;
private SecretKeyFactory mySecretKeyFactory;
private Cipher cipher;
byte[] keyAsBytes;
private String myEncryp onKey;
private String myEncryp onScheme;
SecretKey key;
sta c BuﬀeredReader br =
new BuﬀeredReader(new InputStreamReader(System.in));
public DESAlgorithm() throws Excep on {
myEncryp onKey = "ThisIsSecretEncryp onKey";
myEncryp onScheme = DES_ENCRYPTION_SCHEME;
keyAsBytes = myEncryp onKey.getBytes(UNICODE_FORMAT);
myKeySpec = new DESKeySpec(keyAsBytes);
mySecretKeyFactory =
SecretKeyFactory.getInstance(myEncryp onScheme);
cipher = Cipher.getInstance(myEncryp onScheme);
key = mySecretKeyFactory.generateSecret(myKeySpec);
}
public String encrypt(String unencryptedString) {
String encryptedString = null;
try {
cipher.init(Cipher.ENCRYPT_MODE, key);
byte[] plainText =
unencryptedString.getBytes(UNICODE_FORMAT);
byte[] encryptedText = cipher.doFinal(plainText);
Base64.Encoder base64encoder =
Base64.getEncoder();
encryptedString =
base64encoder.encodeToString(encryptedText);
} catch (Excep on e) {
e.printStackTrace();
}
return encryptedString;
}
public String decrypt(String encryptedString) {
String decryptedText = null;
try {
cipher.init(Cipher.DECRYPT_MODE, key);
Base64.Decoder base64decoder =
Base64.getDecoder();
byte[] encryptedText =
base64decoder.decode(encryptedString);
byte[] plainText =
cipher.doFinal(encryptedText);
decryptedText = bytes2String(plainText);
} catch (Excep on e) {
e.printStackTrace();
}
return decryptedText;
}
private sta c String bytes2String(byte[] bytes) {
StringBuﬀer stringBuﬀer = new StringBuﬀer();
for (int i = 0; i < bytes.length; i++) {
stringBuﬀer.append((char) bytes[i]);
}
return stringBuﬀer.toString();
}
public sta c void main(String args[]) throws Excep on {
System.out.print("Enter the string: ");
DESAlgorithm myEncryptor = new DESAlgorithm();
String stringToEncrypt = br.readLine();
String encrypted =
myEncryptor.encrypt(stringToEncrypt);
String decrypted =
myEncryptor.decrypt(encrypted);
System.out.println("\nString To Encrypt: "
+ stringToEncrypt);
System.out.println("\nEncrypted Value: "
+ encrypted);
System.out.println("\nDecrypted String: "
+ decrypted);
}
}