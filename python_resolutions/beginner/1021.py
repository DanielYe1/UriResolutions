import math

number = float(input())
note = math.floor(number)
notes = (100,50,20,10,5,2,1)
print("NOTAS:")
for i in notes:
    if i!=1:
        print("{0:.0f} nota(s) de R$ {1:.2f}".format(math.floor(note/i),i))
        note = note%i
    else:
        print("MOEDAS:")
        print("{0:.0f} moeda(s) de R$ 1.00".format(math.floor(note/i)))

cents = number * 1000.00 - math.floor(number)*1000
coins = (500,250,100,50,10)
for i in coins:
    print("{0:.0f} moeda(s) de R$ {1:.2f}".format(math.floor(cents/i),i/1000.00))
    cents = round(cents%i,2)
