N, M = map(int, input().split())
board = [input() for _ in range(N)]
answer = 64 # 체스판 64칸 중 가장 많이 바꿔야하는 수 크~게 잡음

def fill(y, x, bw):
    global answer
    cnt = 0
    for i in range(8):
        for j in range(8):
            if (i + j) % 2:
                if board[y + i][x + j] == bw:
                    cnt += 1
            else:#i+j가 홀수
                if board[y + i][x + j] != bw:
                    cnt += 1
    answer = min(answer, cnt)

for i in range(N-7):
    for j in range(M-7):
        fill(i, j, 'B')
        fill(i, j, 'W')

print(answer)