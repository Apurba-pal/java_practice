# Write a Python script where the user provides a number and the program prints its square.

# a = int(input("enter a number: "))
# print(a**2)


# radius of a circle 

# r = int(input("Enter radius: "))
# area = 3.142*(r*r)
# print(area)


# Design a Python script that accepts a single character from the user and displays its corresponding Unicode value.

# a = input("enter a letter: ")
# print("unicode: ", ord(a))

# Create a Python script that accepts two numbers from the user, adds them, and shows the final result.

# a = int(input("Enter the first number"))
# b = int(input("Enter the second number"))

# print (a+b)


# take 4 digits from the user and display the 2nd digit

# a = int(input("enter a number: "))
# val = a%100
# val = val//10
# print(val)

# a = int(input("enter a number: "))
# val = a//100
# val = val%10
# print(val)


# Build a Python script that accepts principal, rate, and time from the user and then computes the Simple Interest.


# p = float(input("Enter the principal : "))
# r = float(input("Enter the rate: "))
# t = float(input("Enter the time: "))
# si = (p * r * t) / 100
# print("Simple Interest:", si)

# length = int(input("Enter length: "))
# width = int(input("Enter width: "))
# print("Area of rectangle:", length * width)


# length = float(input("length: "))
# width = float(input("width: "))
# height = float(input("height: "))

# volume = length * width * height
# print(volume)



# Get the numbers from the user
# x = float(input("base number: "))
# y = float(input("exponent: "))
# print("value : ", x ** y)


# a=int(input("a ="))
# b=int(input("b ="))
# c=int(input("c ="))
# print("average = ",(a+b+c)/3)


# Q1. Take any number from the user and write a Python program to cut off its last digit.
# Example: Input = 4732 → Output = 473

# a = int(input("enter a no: "))
# print("new number:", a//10)


# Q2. Accept a number and write code to find out its last digit only.
# Example: Input = 649 → Output = 9

# a = int(input("enter a no: "))
# print("new number:", a%10)


# Q3. Write a simple Python code to swap two values without using a third variable.
# Tip: Use arithmetic or Python's tuple swapping.

# a = 1
# b = 2
# print("Before swap ", a, b)
# a = a ^ b
# b = a ^ b
# a = a ^ b
# print("After swap ", a, b)

# Q4. Ask the user to input any 3-digit number and display only its first digit.
# Example: For 836 → Output = 8

# a = int(input("enter a no: "))
# print("new number:", a//100)

# Q5. Create a Python program to extract and show only the middle digit of a 3-digit number entered by the user.
# Example: If number is 548 → Output = 4


# a = int(input("Enter three digit number"))
# a = a // 10
# print(a%10)


year = int(input("Enter a number"))
if(year <0):
    print("Enter a valid year")
elif(year % 400 == 0):
    print("Leap year")
elif(year % 100 == 0):
    print("Not a Leap year")
elif(year % 4 == 0):
    print("Leap year")
else:
    print("Not a leap year ")