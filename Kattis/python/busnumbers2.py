m = int(input())

cubes = []

base = 1
while base**3 < m:
    cubes.append(base**3)
    base += 1

num_cubes = len(cubes)

sum_count = {}
biggest_two = -1

for i in range(num_cubes-1):
    for j in range(i+1,num_cubes):
        s = cubes[i]+cubes[j]
        if s > m:
            continue
        if s in sum_count:
            sum_count[s]+=1
            if sum_count[s]==2:
                if s>biggest_two:
                    biggest_two=s
        else:
            sum_count[s]=1

if biggest_two == -1:
    print('none')
else:
    print(biggest_two)