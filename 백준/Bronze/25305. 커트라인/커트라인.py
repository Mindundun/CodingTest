n, p = map(int, input().split())
score = list(map(int, input().split()))

#정렬
score.sort()

print(score[p*-1]) #뒤에서 p번째