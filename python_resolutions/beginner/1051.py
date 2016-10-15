money = float(input())
count = 0
if money <= 2000:
    print("Isento")
elif money <= 3000:
    money -=2000
    count = money*0.08
elif money <= 4500:
    money -=3000
    count = 1000*0.08 + money*0.18
elif money > 4500:
    money -=4500
    count = 1000*0.08 + 1500*0.18 + money*0.28
if count!= 0:
    print("R$ {0:.2f}".format(count))