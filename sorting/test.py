try:
    A = [1, 2, 3]
    print(A[3])
except IndexError as v:
    print("Error:", v)
else:
    print("No exception")
finally:
    print("Always execute")