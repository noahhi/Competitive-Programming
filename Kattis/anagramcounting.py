import math

while True:
    try:
        word = input()
        length = len(word)
        counts = {}
        for ch in word:
            if ch in counts:
                counts[ch] += 1
            else:
                counts[ch] = 1
        #print(counts)
        dup_count = 1
        for ch in counts:
            count = counts[ch]
            if count > 1:
                dup_count = dup_count * math.factorial(count)
        sol = math.factorial(length)//dup_count
        print(sol)
    except EOFError:
        break
