def check_range(num, bottom, top, count):
    if count > 14:
        return 'MEMBER'
    dist = top - bottom
    third = dist * (1/3)
    bottom_third = bottom + third
    top_third = bottom + third + third
    if num < bottom_third:
        return check_range(num, bottom, bottom_third,count+1)
    if num > top_third:
        return check_range(num, top_third, top, count+1)
    return 'NON-MEMBER'
    
    
while True:
    inp = input()
    if inp == "END":
        break
    x = float(inp)
    print(check_range(x,0,1,1))