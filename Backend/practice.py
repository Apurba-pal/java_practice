# count number of vowel in a string

# str = "aeiouAEIOU"
# inputStr = "Rookies"
# count = 0
# for i in range(len(inputStr)):
#     if inputStr[i] in str:
#         count+=1

# print(count)


# reverse a string without using slicing 
inputStr = "Rookies"
reverseStr = ""
for i in range(len(inputStr)-1,-1,-1):
    reverseStr +=inputStr[i]

print(reverseStr)