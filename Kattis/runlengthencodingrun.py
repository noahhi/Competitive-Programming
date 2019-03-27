command,s = input().split()
res = ''
if command == 'E':
    prev_ch = ''
    count = 1
    for i in range(len(s)):
        curr_ch = s[i]
        if curr_ch == prev_ch:
            count += 1
        else:
            if prev_ch != '':
                res += prev_ch + str(count)
            count = 1
            prev_ch = curr_ch
    res += prev_ch + str(count)
    print(res)
elif command == 'D':
    for i in range(0,len(s)-1,2):
        ch = s[i]
        mult = s[i+1]
        res += ch*int(mult)
    print(res)
else:
    print('error reading command')