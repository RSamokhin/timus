import sys
n = int(sys.stdin.readline())
exams = []
for i in range(n):
    exams.append(int(sys.stdin.readline()))

# print exams

if sum(exams) == n * 5:
    print 'Named'
elif any(map(lambda x: x <= 3, exams)):
    print 'None'
else:
    # print sum(exams) * 10 / n
    if sum(exams) * 10 / n >= 45:
        print 'High'
    else:
        print 'Common'
