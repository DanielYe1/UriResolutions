import math

x = [int(i) for i in input().split()]
while x[0] != 0:
    size = x[0] * x[1]
    totsize = size / (x[2] / 100)
    lado = totsize ** (1 / 2)
    print("{0:.0f}".format(math.floor(lado)))
    x = [int(i) for i in input().split()]
