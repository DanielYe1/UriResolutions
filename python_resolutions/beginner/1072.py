times = int(input())
count = 0
for i in range(times):
    x = int(input())
    if 10 <= x <= 20:
        count += 1
print("{0} in".format(count))
print("{0} out".format(times - count))