def solution(myString):
    answer = ''
    
    for i in range(len(myString)):
        answer += myString[i].upper() if myString[i] in 'a, A' else myString[i].lower()
            
    return answer