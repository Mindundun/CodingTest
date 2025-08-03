def solution(numbers):
    answer = -1
    # 없는 숫자를 더하는게 아닌 1~9까지 총 합계에서 존재숫자를 차감하는 방식으로 발상전환..
    TotSum = 45
    
    # 이걸 TotSum -= sum(numbers)로 할 수 있음
    for i in numbers:
        TotSum -= i
    
    answer = TotSum
    return answer