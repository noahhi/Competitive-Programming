n = int(input())
popularity = {}
max_pop = 0

for i in range(n):
    courses = input().split()
    courses.sort()
    courses = tuple(courses)
    if courses in popularity:
        popularity[courses]+=1
        if popularity[courses]>max_pop:
            max_pop=popularity[courses]
    else:
        popularity[courses]=1
        if popularity[courses]>max_pop:
            max_pop=popularity[courses]
#print(max_pop)
#print(popularity)

max_pop_count = 0
for course in popularity:
    if popularity[course]==max_pop:
        max_pop_count+=1

print(max_pop_count*max_pop)
