T = int(input())

for i in range(T):
    R,S=input().split()
    list(S)
    for j in range(len(S)):
        print(S[j]*int(R), end="")
    print()
    
#구글링 
# n = int(input())

# for _ in range(n):
#     cnt, word = input().split()
#     for x in word:
#         print(x*int(cnt), end='')
#     print()