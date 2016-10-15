count = 0
x = 0
for i in range(6):
    k = float(input())
    if k > 0:
        count += 1
        x += k

print("{0} valores positivos".format(count))
print("{0:.1f}".format(x/count))