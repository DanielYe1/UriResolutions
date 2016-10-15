import sys

count = 0
count1 = 0
tot = 0
for line in sys.stdin:
    count += 1
    if count % 2 == 0:
        tot += int(line)
        count1 += 1
print("{0:.1f}".format(tot / count1))
