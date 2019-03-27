import re

n = int(input())
clock1 = list(map(int,input().split()))
clock2 = list(map(int,input().split()))

clock1.sort()
clock2.sort()

clock1angles = []
clock2angles = []

clock1angles.append(360000-clock1[-1]+clock1[0])
clock2angles.append(360000-clock2[-1]+clock2[0])
for i in range(n-1):
    clock1angles.append(clock1[i+1]-clock1[i])
    clock2angles.append(clock2[i+1]-clock2[i])
    

clock1angles += clock1angles
clock1angles = map(str,clock1angles)
clock2angles = map(str,clock2angles)

clock1str = " ".join(clock1angles)
clock2str = " ".join(clock2angles)

if re.search(clock2str, clock1str):
    print('possible')
else:
    print('impossible')