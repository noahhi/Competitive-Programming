x = int(input())
n = int(input())
total = 0
for i in range(n):
    p = int(input())
    total += x-p
print(total+x)