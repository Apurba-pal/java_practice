# Function for factorial of a number
def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n-1)

# Function for Fibonacci series
def fibonacci(n):
    n1 = 0
    n2 = 1
    print(n1)
    print(n2)
    for i in range(0, n-2):
        ans = n1 + n2
        print(ans)
        n1 = n2
        n2 = ans

# Function to reverse a number
def reverse_number(n):
    new_no = 0
    while n > 0:
        m = n % 10
        new_no = new_no * 10 + m
        n = n // 10
    return new_no

# Function to reverse a string
def reverse_string(s):
    return s[::-1]

# Function to check if a number is a palindrome
def is_number_palindrome(n):
    original_num = n
    new_no = 0
    while n > 0:
        m = n % 10
        new_no = new_no * 10 + m
        n = n // 10
    return original_num == new_no

# Function to check if a string is a palindrome
def is_string_palindrome(s):
    return s == s[::-1]


def who_made_python():
    print("Python can be used for various tasks like web development, data analysis, machine learning, automation, and more.")
    print("Who created Python?")
    print("Guido van Rossum.")
    print("Which year?")
    print("1991.")


# Test the functions
print("Factorial :", factorial(6))
print("Fibonacci series:", fibonacci(5))
print("Reverse of 123:", reverse_number(123))
print("Reverse of 'hello':", reverse_string("hello"))
print("Is 12321 a palindrome?", is_number_palindrome(12321))
print("Is 'madam' a palindrome?", is_string_palindrome("madam"))
who_made_python()
