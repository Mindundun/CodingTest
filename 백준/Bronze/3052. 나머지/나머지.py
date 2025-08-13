arr = [0] * 42

for i in range(10):
    num = int(input())
    arr[num % 42] = 1
print(sum(arr))