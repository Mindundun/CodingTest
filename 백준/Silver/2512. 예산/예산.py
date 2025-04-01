N = int(input()) # 예산을 분배할 지방의 수
req = list(map(int, input().split())) # 각 지방의 예산 필요 요청 금액
M = int(input()) # 국가 예산 총액

low = 0 # 최소값
high = max(req) # 요청한 예산 중 최고 금액
mid = (low + high) // 2 # 위의 low와 high의 중간 값
answer = 0 # 배정된 예산들 중 최댓값 금액

def is_possible(mid): # 예산 배정 여부 판별 함수
    return sum(min(r, mid) for r in req) <= M # req의 값 혹은 mid의 최솟값의 합계를 국가 예산 총합과 비교

while low <= high: # 이분탐색만큼 줄임
    #print(f'low:{low}, mid:{mid}, high:{high}, answer:{answer}')
    if is_possible(mid): # 위의 함수에서 예산 배정 가능한 경우
        low = mid + 1 # 하한선을 1 증가
        answer = mid
    else: # 위의 함수에서 예산 배정 불가한 경우
        high = mid - 1 # 상한선을 중앙값 -1 한 값으로 변경

    mid = (low + high) // 2 # 중앙값 변경

print(answer)