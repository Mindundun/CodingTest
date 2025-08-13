str = input().strip()
answer = 0

for i in range(len(str)):
    if str[i] == ' ':
        answer += 1

print(answer + 1 if len(str) != 0 else answer)