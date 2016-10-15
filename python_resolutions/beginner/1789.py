import sys

for line in sys.stdin:
    higher = 0
    speed = [int(i) for i in input().split()]
    for x in speed:
        if x > higher:
            higher = x
    if higher <10:
        print(1)
    elif 20 > higher >=10:
        print(2)
    elif higher >= 20:
        print(3)