a,b=[],[]

n,m=map(int,input().split())

for i in range(n):
    row = list(map(int,input().split()))
    a.append(row)

for i in range(n):
    row = list(map(int,input().split()))
    b.append(row)
    
for i in range(n):
    for j in range(m):
        print(a[i][j]+b[i][j], end=" ")
    print()
    
# GPT Version
# N, M = map(int, input().split())

# A = [list(map(int, input().split())) for _ in range(N)]

# B = [list(map(int, input().split())) for _ in range(N)]

# result = [[A[i][j] + B[i][j] for j in range(M)] for i in range(N)]

# for row in result:
#     print(row)