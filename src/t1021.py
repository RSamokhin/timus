import sys
result = 'YES'

a1 = set()
n1 = int(sys.stdin.readline())
for i in range(n1):
    a1.add(10000 - int(sys.stdin.readline()))
l1 = len(a1)

a2 = set()
n2 = int(sys.stdin.readline())
for i in range(n2):
    a2.add(int(sys.stdin.readline()))

if len(a1) + len(a2) == len(a1.union(a2)):
    result = "NO"


print result
