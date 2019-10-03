import math

case = 1
while True:
    try:
        n = int(input())
        digits = math.log(3,10)+(n*math.log(1.5,10))
        sol = math.floor(digits+1)
        #circum = 3 * (3/2)**n
        #digits = math.floor(math.log(circum,10)+1)
        print('Case ' + str(case) + ': ' + str(sol))
    except EOFError:
        break
    case += 1