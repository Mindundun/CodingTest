Cnt = int(input())
Sum=[]

num = int(1)

while num <= Cnt :
    Input1, Input2 = map(int,input().split())
    Sum.append(Input1+Input2)
        
    num = num + 1
    
for i in range(Cnt):
    print(Sum[i])