number=list(map(int,input().split()))
sum=0

for i in number:
    sum+=i**2

print(sum%10)

# number=list(map(int,input().split()))
# print(sum(i ** 2 for i in number)%10)