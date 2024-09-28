input1, input2, input3 = map(int,input().split())

print((input1+input2)%input3)
print(((input1%input3)+(input2%input3))%input3)
print((input1*input2)%input3)
print(((input1%input3)*(input2%input3))%input3)