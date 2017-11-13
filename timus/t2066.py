import sys

ones = []
didgits = []
minimum = None
for figure in sys.stdin:
    d = int(figure)
    if d == 0:
        if minimum == 1:
            ones.append(minimum)
        elif minimum > 1:
            didgits.append(minimum)
        minimum = 0
        continue
    elif d == 1:
        if minimum == 0 or minimum == 1:
            ones.append(d)
        elif minimum is None:
            minimum = 1
        else:
            didgits.append(minimum)
            minimum = 1
    else:
        if minimum is None:
            minimum = d
        elif d < minimum:
            didgits.append(minimum)
            minimum = d
        else:
            didgits.append(d)

# print minimum
print '%d'%(minimum - sum(ones) - reduce(lambda x, y: x * y, didgits if len(didgits) else [0]))
