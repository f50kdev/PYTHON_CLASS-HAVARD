#calculator in python
# outhor : faustino Henriques 2025 

from calendar import firstweekday


first_value   = float(input("insert the value "))
second_value = float(input(" insert your second value "))

#calculatino the fisrt and second value

total = round(first_value + second_value) 
print(f"the total is : {total}")
print(f"{total:,}")

#limitation of  
valueOne = float(2)  
valueTwo = float(3)
tota = round(valueOne/valueTwo)
print(f"{tota:.3f}")

