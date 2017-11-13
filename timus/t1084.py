import sys
import math
inputs = map(lambda x: float(x), sys.stdin.readline().split(' '))
a = inputs[0]
r = inputs[1]

result = 0
if r <= a / 2:
    result = math.pi * r * r
elif r >= math.sqrt(2 * a/2 * a/2):
    result = a * a
else:
    q = 2 * math.acos((a / 2) / r)
    # print q * 180 / math.pi
    result = math.pi * r * r - 4 * ((r * r / 2) * (q - math.sin(q)))

print round(result, 3)

