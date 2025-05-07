T=int(input())

H,W,N=map(int,input().split())

# 6H 12W 10N = 402
# 6H 12W 1N = 101
# 6H 12W 2N = 201
# 6H 12W 3N = 301
# 6H 12W 4N = 401
# 6H 12W 5N = 501
# 6H 12W 6N = 601

a=N%H
if(N%H==0):
    a=N