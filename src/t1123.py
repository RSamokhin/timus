import sys

mystr = sys.stdin.readline().strip()

ifM = False if len(mystr) == len(mystr) / 2 * 2 else True

firstPart = mystr[0:len(mystr)/2]
# print '1=> ', firstPart
middle = '' if not ifM else mystr[len(mystr)/2]
# print 'm=> ', middle
secondPart = mystr[len(mystr)/2 + (1 if ifM else 0):]
# print '2=> ', secondPart


ifSecondPartLess = True
firstPartReversed = firstPart[::-1]
for i in range(len(firstPartReversed)):
    # print secondPart[i], firstPartReversed[i]
    if secondPart[i] > firstPartReversed[i]:
        ifSecondPartLess = False
        break
    elif secondPart[i] == firstPartReversed[i]:
        continue
    else:
        break


if ifSecondPartLess:
    secondPart = firstPart[::-1]
else:
    firstPart = (firstPart + middle)[::-1]
    newFirstPart = ''
    add = 1
    for d in firstPart:
        d = int(d)
        d = d + add
        add = 0
        if d > 9:
            add = add + 1
            newFirstPart += '0'
        else:
            newFirstPart = newFirstPart + "%d"%(d)

    firstPart = newFirstPart[::-1]

    if middle != '':
        firstPart = firstPart[:-1]
        middle = '%d'%((int(middle)+1) % 10)
    # print(firstPart)
    secondPart = firstPart[::-1]
sys.stdout.write(firstPart + middle + secondPart)