import sys
inputs = map(lambda x: int(x), sys.stdin.readline().split(' '))
n = inputs[0]
m = inputs[1] % n

figures = []
for i in range(n):
    figures.append(sys.stdin.readline().strip())
print ''.join([''.join(figures), ''.join(figures)])[m:m+10]