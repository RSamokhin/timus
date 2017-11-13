import sys

n = int(sys.stdin.readline())

q = []

for i in range(n):
    q.append(int(sys.stdin.readline()))

m = max(q)

array = [2.0]

i = 0
current = 2.0

while i < m:
    current += 1
    if current % 2 == 0:
        continue
    isSimple = True
    checkMax = current
    for f in array:
        if current / f == int (current / f):
            isSimple = False
            break
        if f > checkMax:
            break
        checkMax = current / f
    if isSimple:
        array.append(current)
        i += 1
array.insert(0,1)

for i in q:
    print int(array[i])