def solution(numbers, n):
    answer = 0
    
    for i in numbers:
        answer += i
        if answer > n: # 더한 값이 n보다 큰 경우 
            return answer
        
    