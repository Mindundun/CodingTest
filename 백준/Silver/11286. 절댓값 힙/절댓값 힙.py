import heapq as hq
import sys

#파이썬은 느린 언어로 input() 함수가 아닌 빠른 입력으로 작성
#N = int(input())
input = sys.stdin.readline
pq = []

for i in range(int(input())):
    X = int(input())
    if X :
       hq.heappush(pq,(abs(X),X))
    else:
        print(hq.heappop(pq)[1] if pq else 0)
        # if pq:
        #     print(hq.heappop(pq))
        # else:
        #     print(0)