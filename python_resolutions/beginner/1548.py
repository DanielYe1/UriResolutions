times = int(input())
for i in range(times):
    x = int(input())
    count = 0
    fila2 = []
    fila = [int(i) for i in input().split()]
    for i in range(len(fila)):
        fila2.append(fila[i])

    fila2.sort()
    for i in range(len(fila)):
        if fila[i] == fila2[len(fila2)-i-1]:
            count += 1
    print(count)
