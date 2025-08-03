def solution(num_list):
    answer = 0
    
    for i in range(len(num_list)):
        # 음수라면 정답을 음수 등장 순번으로 넣음
        if (num_list[i] < 0):
            answer = i
            break
                
    # answer가 0이면 num_list의 0번째가 음수인지 한번더 , ,(비효율적이긴하네) 
    answer = -1 if (answer == 0 and num_list[0] > 0) else answer        
    return answer