import re

def main():
    # read number of test cases
    t = int(input())

    for _ in range(t):
        # read number of people
        n = int(input())
        scores = []
        
        for _ in range(n):
            line = input()
            # split on whitespace, dashes, and colon
            strs = re.split(r'[: -]',line)
            # remove empty strings
            strs = list(filter(None, strs))
            #print(strs)

            # extract person's name and their class description
            name = strs[0]
            classes = strs[1:-1]
            mapped = map(classMap, classes)
            nums = list(mapped)
            nums.reverse()
            padded = nums + [1] * (10-len(nums))
            padded.reverse()
            score = 0
            for i in range(10):
                score += (padded[i] * (3**i))
            scores.append((name,score))
        # sort by score and alphabetically
        scores.sort(key=mySort)
        #print(scores)
        for name,score in scores:
            print(name)
        print('='*30)

def mySort(pair):
    name, score  = pair
    return -score, name
    

def classMap(caste):
    if caste == 'lower':
        return 0
    elif caste == 'middle':
        return 1
    elif caste == 'upper':
        return 2

if __name__=='__main__':
    main()
