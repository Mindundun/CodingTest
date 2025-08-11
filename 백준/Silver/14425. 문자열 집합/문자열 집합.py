n, m = map(int, input().split())
setN = set(input() for _ in range(n))
answer = 0

for _ in range(m):
    word = input()
    if word in setN:
        answer += 1

print(answer)