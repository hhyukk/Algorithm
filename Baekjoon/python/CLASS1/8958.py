tCount=int(input())
for i in range(tCount):
    T=list(input())
    score=0
    result=0
    for j in T:
        if j=="O" :
            score+=1
            result+=score
        else:
            score=0
    print(result)