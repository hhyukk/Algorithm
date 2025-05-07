a=list()
for i in range(10):
    x=int(input())
    if(a.count(x%42) == 0):
        a.append(x%42)

print(len(a))

# 구글링1: for문을 사용 
# arr = []
# for i in range(10):
#     a = int(input())
#     if a%42 not in arr:
#         arr.append(a % 42)
# print(len(arr))

# 구글링2: set 함수를 사용(set 함수는 중복된 값을 뺄 수 있으나, 순서가 섞임)
# arr = []
# for i in range(10):
#     a = int(input())
#     arr.append(a % 42)
    
# print(set(arr))
# print(len(set(arr)))