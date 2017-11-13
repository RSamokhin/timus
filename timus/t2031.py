import sys
n = int(sys.stdin.readline())
subseq = {}
tmpSubSeq = []
for i in range(100)[1:]:
    figure = '%d'%i if i > 9 else  '0%d'%i
    if all(map(lambda x: x in ['0', '1', '6', '8', '9'], figure)):
        tmpSubSeq.append(figure)
    else:
        tmpArray = [] if (subseq.get(len(tmpSubSeq)) is None) else subseq.get(len(tmpSubSeq))
        if len(tmpSubSeq):
            tmpArray.append(tmpSubSeq)
        subseq[len(tmpSubSeq)] = tmpArray
        # print tmpSubSeq
        tmpSubSeq = []

# print subseq
if n > max(subseq.keys()):
    print 'Glupenky Pierre'
else:
    print ''.join(map(lambda y: ('6' if y == '9' else ('9'if y == '6' else y)),' '.join(map(lambda x: x[::-1],subseq.get(max(subseq.keys()))[0][:n])[::-1])))