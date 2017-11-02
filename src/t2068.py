import sys
n = int(sys.stdin.readline())
heaps = map(lambda x: int(x) ,sys.stdin.readline().split(' '))

if sum(map(lambda x: x/2,heaps)) % 2:
    print 'Daenerys'
else:
    print 'Stannis'