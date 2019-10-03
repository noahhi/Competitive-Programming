c = int(input())

for i in range(c):
    line = input()
    ints = list(map(int, line.split()))
    n = ints[0]
    scores = ints[1:]
    avg = sum(scores)/len(scores)
    count = 0
    for score in scores:
        if score > avg:
            count += 1
    percent = (count/n)*100
    print(format(percent,'0.3f')+'%')