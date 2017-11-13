import sys

n = float(sys.stdin.readline())
result = -1
figures = []

hasSolution = True

while hasSolution:
    success = False
    for i in range(2,10,1)[::-1]:
        if n / i == int(n / i):
            n /= i
            figures.append(i)
            success = True
            break
    if n == 1:
        if len(figures) == 0:
            figures.append(1)
        break
    if not success:
        hasSolution = False
    if n == 0:
        result = 10
        hasSolution = False

# print figures
if hasSolution:
    figures.sort()
    print ''.join(map(lambda x: '%d' % x, figures))
else:
    print result