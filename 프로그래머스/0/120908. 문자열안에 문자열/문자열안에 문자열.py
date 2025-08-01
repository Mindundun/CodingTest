def solution(str1, str2):
    answer = 0
    
    # str1에 str2문자열이 존재하면 1 아니면 2 대입
    answer = 1 if str2 in str1 else 2
    
    return answer