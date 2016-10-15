number = int(input())
for i in range(number):
    valores = [float(k) for k in input().split()]
    x = valores[0] * 0.2 + valores[1] * 0.3 + valores[2] * 0.5
    print("{0:.1f}".format(x))
