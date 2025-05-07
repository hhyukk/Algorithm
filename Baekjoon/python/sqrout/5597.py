studentNumber=[]

for i in range(28):
    studentNumber.append(int(input()))
    
for i in range(1,31):
    if i not in studentNumber:
        print(i)