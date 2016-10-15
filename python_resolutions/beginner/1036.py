import math

k = input().split()
a = float(k[0])
b = float(k[1])
c = float(k[2])

d = b ** 2 - 4 * a * c
if d > 0 and a != 0:
    x1 = (-b + math.sqrt(d)) / (2 * a)
    x2 = (-b - math.sqrt(d)) / (2 * a)
    print('R1 = {0:.5f}'.format(x1))
    print('R2 = {0:.5f}'.format(x2))
else:
    print('Impossivel calcular')
