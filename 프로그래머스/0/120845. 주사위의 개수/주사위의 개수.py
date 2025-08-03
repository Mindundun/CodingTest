def solution(box, n):
    answer = 0
    # 우선 바닥층 가로와 세로에 주사위 n면이 들어갈 수 있는 최대를 구함
    floor = (box[0] // n) * (box[1] // n)
    
    # 기존에 바닥층에 놓을 수 있는 갯수에 높이기준으로 쌓을 수 있는 최대를 곱함
    answer = floor * (box[2] // n)

    #answer = (box[0] // n) * (box[1] // n) * (box[2] // n) 이렇게 한줄로 가능
    return answer