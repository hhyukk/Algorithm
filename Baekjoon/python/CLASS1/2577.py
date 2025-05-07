A=int(input())
B=int(input())
C=int(input())

result=A*B*C

dic=[0]*10

while result>0:
    dic[result%10]+=1
    result=result//10
    
for i in dic:
    print(i)

# 내 코드 2
# dic={0:0,1:0,2:0,3:0,4:0,5:0,6:0,7:0,8:0,9:0,}

# while True:
#     dic[result%10]+=1
#     result=result//10
#     if result==0:
#         break;
    
# for i in dic.values():
#     print(i)

# 구글 코드 1
# result = list(str(A*B*C))

# for i in range(10):
#     print(result.count(str(i)))

# 구글 코드 2
# result = list(str(A*B*C))
# for i in range(0,10):
#     count = 0
#     for num in result:
#         if i == int(num):
#             count += 1
#     print(count)