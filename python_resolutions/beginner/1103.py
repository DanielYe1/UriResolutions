h = 0
x = [int(i) for i in input().split()]
while x[0] + x[1] + x[2] + x[3] != 0:
    if x[1] < x[3]:
        min = x[3] - x[1]
    elif x[1] == x[3]:
        min = 0
    elif x[1] > x[3]:
        min = 60 - x[1] + x[3]
        h = -1

    if x[0] > x[2]:
        h += 24 - x[0] + x[2]
    elif x[0] == x[2]:
        if x[1] > x[3]:
            h += 24
    elif x[0] < x[2]:
        h += x[2] - x[0]

    if x[1] == x[2] == x[3] == x[0]:
        h = 24

    totalm = min + h * 60
    print(totalm)
    x = [int(i) for i in input().split()]
    min = 0
    h = 0
