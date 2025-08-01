
2
3
4
5
6
7
8
9
10
11
def solution(n):
    answer = 0

    # 1부터 n번째까지 반복
    for i in range(1, n + 1):
        # n을 반복된 숫자로 나눈 나머지가 0인 경우 나뉜다고 판단
        if(n % i == 0):
            answer += 1

    return answer
