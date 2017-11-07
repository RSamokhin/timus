import sys
n = int(sys.stdin.readline())
data = []
sums = [0]
for i in range(n):
    sums.append(sums[i] + int(sys.stdin.readline()))

q = int(sys.stdin.readline())
for i in range(q):
    inputs = map(lambda x: int(x), sys.stdin.readline().split(' '))
    print sums[inputs[1]] - sums[inputs[0] - 1]