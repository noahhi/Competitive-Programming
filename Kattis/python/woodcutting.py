# number of test cases
t = int(input())

for _ in range(t):
    n = int(input()) # number of customers
    customer_weights = []
    
    for _ in range(n):
        pieces = map(int,input().split()[1:])

        total_amount = 0
        for piece in pieces:
            total_amount += piece
            
        customer_weights.append(total_amount)

    customer_weights.sort()
    
    total_weight_time = 0
    for i in range(n):
        total_weight_time += customer_weights[i] * (n-i)

    print(total_weight_time/n)