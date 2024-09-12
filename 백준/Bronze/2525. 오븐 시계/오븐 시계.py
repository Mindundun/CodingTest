Hour, Min = map(int, input().split())
CookMin = int(input())

Hour = Hour + CookMin // 60
Min = Min + CookMin % 60

if Min >= 60 :
    Hour = Hour + 1
    Min =  Min - 60


if Hour >= 24 :
    Hour = Hour - 24


print(Hour,Min)
