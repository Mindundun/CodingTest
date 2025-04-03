from bisect import bisect_left, bisect_right

N = int(input())
cards = sorted(list(map(int, input().split())))
#print(cards)
M = int(input())
qry = list(map(int, input().split()))
answer = []

for q in qry:
    cl = bisect_left(cards, q)
    cr = bisect_right(cards, q)
    #if cards[cl] == q:  # 찾아낸 수가 찾을 수랑 같은 경우
        #answer.append(1)# 1 삽입
    #else:
        #answer.append(0)# 0 삽입
    #cr = bisect_right(cards, q) # bisect_right를 사용하여 bisect_left - bisect_right해서 찾을 수 있음
    answer.append(1 if cr - cl > 0 else 0) # 이렇게 삽입도 가능
print(*answer)#print(' '.join(map(str,answer)))
