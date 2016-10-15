x = [int(i) for i in input().split()]
y = 2

while x[0]+x[1]+x[2]+x[3] != 0:
    if x[0] == x[2] or x[1] == x[3]:
        y = 1

    for i in range(9):
        if x[0] == x[2]-i and x[1] == x[3]-i:
            y = 1
        if x[0] == x[2]+i and x[1] == x[3]+i:
            y = 1
        if x[0] == x[2]+i and x[1] == x[3]-i:
            y = 1
        if x[0] == x[2]-i and x[1] == x[3]+i:
            y = 1

    if x[0] == x[2] and x[1] == x[3]:
        y = 0

    print(y)
    x = [int(i) for i in input().split()]
    y = 2