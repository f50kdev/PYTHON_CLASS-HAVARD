#include <stdio.h>

int main() {
    char *str = "Hello world";
    int i = 0;

    printf("Original string: %s\n", str);
    printf("After XOR with 0: ");

    while (str[i] != '\0') {
        char result = str[i] ^ 0;  
        i++;
    }

    printf("\n");
    return 0;
}
