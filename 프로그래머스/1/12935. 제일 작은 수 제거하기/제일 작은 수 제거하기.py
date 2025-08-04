def solution(arr):
    answer = []
    # 가장 작은 수 제거 전 배열 길이가 1이면 -1 배열 리턴
    if len(arr) == 1:
        return [-1]
    
    # 가장 작은 값을 제거
    arr.remove(min(arr))
    
    # 제거한 arr를 answer에 넣기 !
    answer = arr 
    
    return answer