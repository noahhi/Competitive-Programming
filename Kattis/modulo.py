distinct = {}
for _ in range(10):
    num = int(input())
    mod = num % 42
    if mod in distinct:
        continue
    else:
        distinct[mod] = 1
print(len(distinct))