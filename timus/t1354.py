import sys
s = sys.stdin.readline().strip()
rs, length, newS = s[::-1], len(s) + 1, ''
for i in range(1, length):
    newS = s + rs[len(rs) - i:len(rs)]
    if newS == newS[::-1]:
        break
print newS