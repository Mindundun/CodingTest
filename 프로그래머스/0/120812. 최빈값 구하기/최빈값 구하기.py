def solution(array):
    answer = 0
    num = [0] * 1000 # 1000자리 원소
    max_num = 0 # 많이 등장한 숫자 저장
    max_cnt = 0 # 많이 등장한 숫자의 카운트 저장
    
    for i in array: # array의 숫자를 num배열에 카운트
        num[i] += 1
    
    for i in range(len(num)): # 위의 num배열을 돌면서 
        if(num[i] == max(num)): # 해당하는 num의 i번째 값이랑 num의 최대 카운트가 같다면.
            max_num = i # 최빈수 값 대입
            max_cnt += 1 # 최빈값 카운트의 갯수 + 1
            
    # 최빈값 카운트가 2이상이라면 -1 그게 아니라면 본래의 수 대입
    answer = -1 if max_cnt > 1 else max_num 
    
    return answer