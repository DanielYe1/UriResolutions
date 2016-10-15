count = 0
for i in range(5):
    x = int(input())
    if x % 2 == 0:
        count += 1
print("{0} valores pares".format(count))