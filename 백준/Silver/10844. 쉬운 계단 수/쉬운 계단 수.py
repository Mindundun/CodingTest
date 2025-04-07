MOD = 1_000_000_000

#cache[n][d] : 길이가 n, 마지막 숫자가 d인 계단수 개수
cache = [[0] * 10 for _ in range(101)]  # 100까지
for j in range(1, 10): #앞자리가 0인 자연수는 없다고 문제에서 제시 했기에, 1부터 9까지 픽스
    cache[1][j] = 1

for i in range(2, 101):
    for j in range(10):
        if j > 0: # 0보다 큰 경우 -1 : -1은 불가하기에
            cache[i][j] += cache[i-1][j-1]
            cache[i][j] %= MOD
        if j < 9: # 9보다 작은 경우 +1 : 10은 불가하기에
            cache[i][j] += cache[i-1][j+1]
            cache[i][j] %= MOD

answer = 0
N = int(input())
for j in range(10):
        answer += cache[N][j]
        answer %= MOD
print(answer)