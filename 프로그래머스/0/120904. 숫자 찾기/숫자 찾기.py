def solution(num, k):
    strNum = str(num)
    for i in range(len(strNum)):
        if int(strNum[i]) == k:
            return i + 1
    return -1 # 없으면 -1