Alpha=[-1]*26
S=input()
count=0
for i in S:
    if Alpha[ord(i)-97] == -1:
        Alpha[ord(i)-97]=count
    count+=1
for i in Alpha:
    print(i, end=" ")


# 구글링1 (for문 이용)
# S = list(input())
# c = 'abcdefghijklmnopqrstuvwxyz'
# for i in c:
#     if i in S:
#         print(S.index(i), end =' ')
#     else:
#         print(-1, end=' ')


# 구글링2 (find() 이용)
# S = input()
# for x in 'abcdefghijklmnopqrstuvwxyz':
#     print(S.find(x), end = ' ')