N = int(input())

for i in range(N):
    arr = []
    isVPS = True
    for ch in input():
        if ch == '(':
            arr.append(ch)
        else:
            if len(arr) > 0: # 만약 pop할 요소가 없으면 오류나서 이와 같이 처리!
                arr.pop()
            else:
                isVPS = False
                break

    if len(arr) > 0:
        isVPS = False

    print('YES' if isVPS else 'NO')