import sys

n = int(sys.stdin.readline())

data = []
maxX, maxY = 0, 0
minX, minY = 'n', 'n'

# collect pairs
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
#print table
# for row in table:
#     print row
# print('=============')
#print first point
# print 'x =', minX, 'y =', minY
# print('=============')


alreadyPainted = []
paintedStringsStack = []

def checkIfExists(x, y):
    exists = False
    for pair in alreadyPainted:
        if (pair[0] == x and pair[1] == y):
            exists = True
            break
    return exists

def recursivePaint(x, y):
    print('=============')
    print '=>x =', x, 'y =', y
    printedString = ''
    nextArrayOfCoordinates = []
    if (x < maxX):
        newX = x + 1
        newY = y
        if not checkIfExists(newX, newY) and table[newX][newY] == 1:
            alreadyPainted.append([newX, newY])
            nextArrayOfCoordinates.append([newX,newY])
            printedString += 'R'
            print 'x =', newX, 'y =', newY
    if (y < maxX):
        newX = x
        newY = y + 1
        if not checkIfExists(newX, newY) and table[newX][newY] == 1:
            alreadyPainted.append([newX, newY])
            nextArrayOfCoordinates.append([newX,newY])
            printedString += 'T'
            print 'x =', newX, 'y =', newY
    if (x > 0):
        newX = x - 1
        newY = y
        if not checkIfExists(newX, newY) and table[newX][newY] == 1:
            alreadyPainted.append([newX, newY])
            nextArrayOfCoordinates.append([newX,newY])
            printedString += 'L'
            print 'x =', newX, 'y =', newY
    if (y > 0):
        newX = x
        newY = y - 1
        if not checkIfExists(newX, newY) and table[newX][newY] == 1:
            alreadyPainted.append([newX, newY])
            nextArrayOfCoordinates.append([newX,newY])
            printedString += 'B'
            print 'x =', newX, 'y =', newY
    paintedStringsStack.append(printedString)

    print 'x = ', x, 'y = ', y, 'str = ', printedString

    for pair in nextArrayOfCoordinates:
        recursivePaint(pair[0], pair[1])

    return

alreadyPainted.append([minX,minY])
recursivePaint(minX, minY)

# print minX + 1, minY + 1
# while len(paintedStringsStack):
#     print paintedStringsStack.pop(0) + (',' if len(paintedStringsStack) else '.')