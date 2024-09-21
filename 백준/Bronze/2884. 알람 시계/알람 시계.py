Hour, Min = map(int, input().split())


if (Min - 45) < 0 :
    if Hour == 0 :
        Hour = 24
    Hour = Hour - 1
    Min = Min + 60

    
print(Hour, Min - 45)
