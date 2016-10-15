h = 0
x = [int(i) for i in input().split()]
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
    h += 24
elif x[0] < x[2]:
    h += x[2] - x[0]
print("O JOGO DUROU {0} HORA(S) E {1} MINUTO(S)".format(h, min))
