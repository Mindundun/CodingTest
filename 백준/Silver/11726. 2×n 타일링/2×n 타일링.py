MOD = 10007

dp = [0] * 1001 #1000개까지 input되기 때문에 초기화
dp[1] = 1 #2x1의 경우 1가지 경우
dp[2] = 2 #2X2의 경우 2가지 경우
n = int(input())

for i in range(3, 1001): #위에서 1, 2를 구했으니 3부터 시작
    dp[i] = (dp[i-1] + dp[i-2]) % MOD



print(dp[n])