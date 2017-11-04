import sys
import math

p =0
q =0
tmp = sys.stdin.readline().split(' ')
if len(tmp) == 2:
    p = float(tmp[0])/100
    q = float(tmp[1])/100
else:
    p = float(tmp[0])/100
    q = float(sys.stdin.readline())/100
total = 2

while True:
    pn = total * p
    qn = total * q

    if math.floor(pn) != math.floor(qn):
        if abs(math.floor(qn) - qn) > 0.00001:
            if math.floor(qn) - math.floor(pn) >= 1:
                print total
                break

    total += 1

