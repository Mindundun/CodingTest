n = int((input()))
arr = list(map(int, input().split()))
x = int(input())

answer = 0
for i in arr:
    if x == i:
        answer += 1

print(answer)