def solution(numbers):
    answer = 0
    # numbers의 배열 정렬 
    numbers.sort()
    
    # 마이너스와 마이너스를 곱하면 플러스이기에 정렬한 값의 1, 2번째와 뒤에서 1, 2번째를 비교(삼항)
    answer = (numbers[0] * numbers[1]) if (numbers[0] * numbers[1]) > (numbers[-1] * numbers[-2]) else (numbers[-1] * numbers[-2]) 
    
    
    return answer