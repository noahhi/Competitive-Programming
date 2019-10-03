n = int(input())
nums = list(map(int,input().split()))

def recursive(first, rest):
    if len(rest) == 0:
        return first,1
    if len(rest) == 1:
        return ((first*rest[0]+1),rest[0])

    den,num = recursive(rest[0], rest[1:])
    return ((first*den+num),den)
    

sol = recursive(nums[0], nums[1:])
print(str(sol[0]) + '/' + str(sol[1]))