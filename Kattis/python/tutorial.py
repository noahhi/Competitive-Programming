import math

def main():
    line = input().split()
    m = int(line[0]) # operations per sec
    n = int(line[1]) # problem size
    t = int(line[2]) # time limit class

    passed = False
    
    if t == 1:   # n!
        passed = True
        num = 1
        res = 1
        while num < n:
            res = res * (num+1)
            if res > m:
                passed = False
                break
            num += 1
        
    elif t == 2: # 2^n
        if math.pow(2,n) <= m:
            passed = True
        
    elif t == 3: # n^4
        if n**4 <= m:
            passed = True

    elif t == 4: # n^3
        if n**3 <= m:
            passed = True

    elif t == 5: # n^2
        if n**2 <= m:
            passed = True

    elif t == 6: # nlogn
        if n*math.log(n,2) <= m:
            passed = True

    elif t == 7: # linear
        if n <= m:
            passed = True
            
    if passed:
        print('AC')
    else:
        print('TLE')
    

if __name__ == "__main__":
    main()
