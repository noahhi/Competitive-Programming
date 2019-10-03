a,b = input().split()
m,s = input().split()

a=int(a)
b=int(b)
m=int(m)
s=int(s)

maxXval = a*(m-1)+b

x = max(1,s-m)
maxYval = a*x+b*(m-x)

print(max(maxXval,maxYval))
