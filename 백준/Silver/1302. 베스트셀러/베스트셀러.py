d = dict()
for i in range(int(input())):
    book = input()
    if book in d:
        d[book] += 1
    else:
        d[book] = 1

m = max(d.values())
top_sales = []

for k,v in d.items():
    if v == m:
        top_sales.append(k)
top_sales.sort()
print(top_sales[0])
