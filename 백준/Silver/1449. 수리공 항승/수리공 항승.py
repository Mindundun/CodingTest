N, L = map(int, input().split())

coord = [False] * 1001 # 리스트를 만듬 0~1000

# 구멍이 난 곳을 True로 변환
for i in map(int, input().split()):
    coord[i] = True

answer = 0
x = 0
while x < 1001:
    if coord[x]: # 구멍이 났다면
        answer += 1
        x += L
    else:
        x += 1
print(answer)