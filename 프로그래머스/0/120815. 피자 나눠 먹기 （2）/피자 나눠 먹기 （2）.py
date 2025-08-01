import math

def solution(n):
    answer = 0
    
    # 최대공배수
    gcd = math.gcd(n, 6) # 사람은 n명, 피자는 6 조각
    # 최소공약수
    answer = abs(n * 6) // gcd / 6 # 최소공약수 / 피자 6조각
    
    
    return answer