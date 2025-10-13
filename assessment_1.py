# 1. Write a program to print "Hello, World!"
# 2. Print your name, age, and city.
# 3. Swap two numbers using a temporary variable.
# 4. Swap two numbers without using a third variable.
# 5. Find the ASCII value of a character.
# 6. Convert temperature from Celsius to Fahrenheit.
# 7. Convert temperature from Fahrenheit to Celsius.
# 8. Calculate the area of a circle given the radius.
# 9. Calculate the perimeter of a rectangle.
# 10. Check whether a number is even or odd.

def HelloWorld():
    print("hello world")

def nameAgeCity(name, age, city):
    print(f"name = {name}, age = {age}, city = {city}")

def tempVarSwap(a, b):
    print(f"before swapping , a = {a} b = {b}")
    temp = a
    a = b
    b = temp
    print(f"after swapping , a = {a} b = {b}")

def swap(a, b):
    print(f"before swapping , a = {a} b = {b}")
    a, b = b,a
    print(f"after swapping , a = {a} b = {b}")

def ascii_val(ch):
    if ch is None or len(ch) == 0:
        return None
    return ord(ch[0])

def c_to_f(c):
    return c * 9.0 / 5.0 + 32.0

def f_to_c(f):
    return (f - 32.0) * 5.0 / 9.0

def circleArea(radius):
    return 3.14*radius*radius

def perimeterRectange(length, breadth):
    return length * breadth

def odd_even(n):
    if(n % 2 == 0):
        print("even")
    else:
        print("odd")



HelloWorld()
nameAgeCity("apurba", "100", "kolkata")
tempVarSwap(3,7)
swap(2, 8)
print(ascii_val("A"))
print(c_to_f(1))
print(f_to_c(100))
print(circleArea(3))
print(perimeterRectange(2, 5))
odd_even(4)