import sys
import re
inpt = sys.stdin.readline().split(' ')
if len(inpt) == 1:
    n = int(inpt[0])

    data = []
    maxX, maxY = 0, 0
    minX, minY = 'n', 'n'

    for i in range(n):
        line = sys.stdin.readline().split(' ')
        x = int(line[0]) - 1
        y = int(line[1]) - 1
        data.append([x,y])
        maxX = max(x, maxX)
        maxY = max(y, maxY)
        # begin x coordinate
        if (minX == 'n'):
            minX = x
        else:
            minX = min(y, minX)

    # init zerro array
    table = [[0] * (max(maxX,maxY) + 1) for i in range(max(maxX,maxY) + 1)]
    # fill array
    for pair in data:
        table[pair[0]][pair[1]] = 1
    # begin y coordinate
    minY = min([x for x in range(len(table[minX])) if table[minX][x] == 1])

    alreadyPainted = []
    paintedStringsStack = []

    def checkIfExists(x, y):
        exists = False
        for pair in alreadyPainted:
            if (pair[0] == x and pair[1] == y):
                exists = True
                break
        return exists

    queu = []

    def recursivePaint(dot):
        x = dot[0]
        y = dot[1]
        printedString = ''
        if (x <  maxX):
            newX = x + 1
            newY = y
            if not checkIfExists(newX, newY) and table[newX][newY] == 1:
                alreadyPainted.append([newX, newY])
                queu.append([newX,newY])
                printedString += 'R'
                # print 'x =', newX, 'y =', newY
        if (y < maxX):
            newX = x
            newY = y + 1
            if not checkIfExists(newX, newY) and table[newX][newY] == 1:
                alreadyPainted.append([newX, newY])
                queu.append([newX,newY])
                printedString += 'T'
                # print 'x =', newX, 'y =', newY
        if (x > 0):
            newX = x - 1
            newY = y
            if not checkIfExists(newX, newY) and table[newX][newY] == 1:
                alreadyPainted.append([newX, newY])
                queu.append([newX,newY])
                printedString += 'L'
                # print 'x =', newX, 'y =', newY
        if (y > 0):
            newX = x
            newY = y - 1
            if not checkIfExists(newX, newY) and table[newX][newY] == 1:
                alreadyPainted.append([newX, newY])
                queu.append([newX,newY])
                printedString += 'B'

        paintedStringsStack.append(printedString)
        return

    alreadyPainted.append([minX,minY])
    queu.append([minX,minY])
    while len(queu):
        recursivePaint(queu.pop(0))

    print minX + 1, minY + 1
    while len(paintedStringsStack):
        print paintedStringsStack.pop(0) + (',' if len(paintedStringsStack) else '.')
else:
    x = int(inpt[0]) - 1
    y = int(inpt[1]) - 1
    regex = re.compile('[^A-Z]')
    dots = [{x: x, y: y}]
    parent = 0
    lines = []

    line = sys.stdin.readline()
    totalDotsNumber = 1
    while True:
        path = regex.sub('', line)
        lines.append(path)
        totalDotsNumber += len(path)
        if line[-1] == '.':
            break
        line = sys.stdin.readline()
    print lines



    # parent = 0
    # while len(lines):
    #     print '========='
    #     line = lines.pop(0)
    #     dot = dots[len(dots) - parent - 1]
    #     for l in line:
    #         if l == 'R':
    #             x = dot[0] + 1
    #             y = dot[1]
    #         if l == 'T':
    #             x = dot[0]
    #             y = dot[1] + 1
    #         if l == 'L':
    #             x = dot[0] - 1
    #             y = dot[1]
    #         if l == 'B':
    #             x = dot[0]
    #             y = dot[1] - 1
    #         dots.append([x, y, parent])
    #         print dot, x,y, parent
    #     parent = parent * len(line) if len(line) else parent + 1

    for i in range(len(lines)):
        for l in lines[i]:
            newDot = {'parent': i * len(l)}
            dots.append(newDot)
    print '========='


    print dots


    print '========='


    # dict = {}
    # for dot in dots:
    #     if (dict.get(dot[x])):
    #         tmp = dict.get(dot[x])
    #         tmp.add(dot[y])
    #     else:
    #         tmp = set()
    #         tmp.add(dot[y])
    #         dict[dot[x]] = tmp
    #
    # keys = dict.keys()
    # keys.sort()
    #
    # for key in keys:
    #     values = list(dict.get(key))
    #     values.sort()
    #     for value in values:
    #         print key + 1, value + 1
