def solution(order):
    answer = 0
    strOrder = str(order)
    for i in range(len(strOrder)):
        if strOrder[i] in '369': # 해당 문자가 3, 6, 9가 해당되면 
            answer += 1
    return answer