import sys

input = sys.stdin.readline
N, P = map(int, input().split())
stk = [[] for _ in range(7)] # 비어있는 스택 7개를 만든다
answer = 0
for _ in range(N):
    line, p = map(int, input().split())
    while stk[line] and stk[line][-1] > p:
        stk[line].pop()
        answer += 1

    if stk[line] and stk[line][-1] == p:
        continue

    stk[line].append(p)
    answer += 1

print(answer)