cache = [-1] * 91
cache[0] = 0 
cache[1] = 1 

def f(n):
    if cache[n] == -1: # 이전에 세팅을 안했다면
        cache[n] = f(n-1) + f(n-2)

    return cache[n]

print(f(int(input())))