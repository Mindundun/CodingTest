from collections import deque

dq = deque()
N = int(input())
for i in range(1, N + 1): # 1, 2, 3, ... , N : 그냥 N을 적으면 N-1
    dq.append(i)

# 위는 선업 후 넣어주는데
# 아래의 코드는 선언과 동시에 값을 넣어줌
# dq = deque(range(1, N + 1))

while len(dq) > 1 : # 1개가 남을 때 까지 실행
    dq.popleft() # 맨 앞의 데이터 삭제
    dq.append(dq.popleft()) # 맨 앞의 데이터 삭제 후 맨 뒤 삽입

print(dq.popleft())
