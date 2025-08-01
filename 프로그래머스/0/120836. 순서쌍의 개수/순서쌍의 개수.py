def solution(n):
    answer = 0
    
    # 1부터 n의 제곱근까지 반복
    for i in range(1, int(n ** 0.5) + 1):
        # n을 반복된 숫자로 나눈 나머지가 0인 경우 나뉜다고 판단(제곱근하여 +2)
        if(n % i == 0):
            answer += 2
            # 만약 i제곱이 나눠진다면 -1 
            if (i * i == n):
                answer -= 1
    return answer
