n, m = map(int,input().split())
arr = list(map(int, input().split()))
answer = []

for i in arr:
    if i < m:
        answer.append(i)

print(' '.join(map(str, answer)))