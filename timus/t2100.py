import sys
count = 2
n = int(sys.stdin.readline())
for i in range(n):
    line = sys.stdin.readline()
    count += len(line.split('+'))
print (14 if count == 13 else count) * 100
