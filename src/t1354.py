import sys
s = sys.stdin.readline().strip()
i = 0
newS = ''
for i in range(1, len(s)+1):
    newS = s + s[:i][::-1]
    if newS == newS[::-1]:
        break
print newS
