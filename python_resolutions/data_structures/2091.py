x = input()
while (x != "0"):
    numeros = [int(i) for i in input().split()]
    set = []
    for num in numeros:
        if (num in set):
            set.remove(num)
        else:
            set.append(num)
    print(set[0])
    x = input()
