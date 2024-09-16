Cnt = int(input())
num = int(1)

while num <= Cnt :
    if num < Cnt:
        print(' '*(Cnt-num-1),'*'*num)
    if num == Cnt:
        print('*'*num)
    num = num + 1
