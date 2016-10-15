times = int(input())
for i in range(times):
    names = input().split()
    value = [int(i) for i in input().split()]
    tot = value[0] + value[1]
    if tot % 2 == 0:
        if names[1] == "PAR":
            print(names[0])
        else:
            print(names[2])
    elif tot % 2 == 1:
        if names[1] == "IMPAR":
            print(names[0])
        else:
            print(names[2])
