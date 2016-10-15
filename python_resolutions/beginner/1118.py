count = 1
while count == 1:
    x = float(input())
    while x > 10 or x < 0:
        print("nota invalida")
        x = float(input())

    y = float(input())
    while y > 10 or y < 0:
        print("nota invalida")
        y = float(input())

    print("media = {0:.2f}".format((x + y) / 2))
    count = int(input("novo calculo (1-sim 2-nao)\n"))
    if count !=2:
        while count!=1:
            count = int(input("novo calculo (1-sim 2-nao)\n"))
            if count == 2:
                break