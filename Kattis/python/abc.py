def main():
    nums = list(map(int,input().split()))
    nums.sort()
    nums = list(map(str, nums))
    order = input()
    out = ''
    for ch in order:
        if ch == "A":
            out += nums[0]+' '
        elif ch == "B":
            out += nums[1]+' '
        else:
            out += nums[2]+' '
    print(out[:-1])


if __name__ == "__main__":
    main()
