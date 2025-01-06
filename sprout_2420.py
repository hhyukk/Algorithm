def factorial(number):
    if(number==0):
        return 1
    return number * factorial(number-1)

number = int(input())
print(factorial(number))