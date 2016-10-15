rabbit = 0
rats = 0
frog = 0
times = int(input())
for i in range(times):
    animal = input().split()
    quant = int(animal[0])
    type = str(animal[1])

    if type == 'C':
        rabbit +=quant
    if type == 'R':
        rats +=quant
    if type == 'S':
        frog +=quant

total = rabbit+rats+frog

print("Total: {0} cobaias".format(total))
print("Total de coelhos: {0}".format(rabbit))
print("Total de ratos: {0}".format(rats))
print("Total de sapos: {0}".format(frog))
print("Percentual de coelhos: {0:.2f} %".format(rabbit/total*100))
print("Percentual de ratos: {0:.2f} %".format(rats/total*100))
print("Percentual de sapos: {0:.2f} %".format(frog/total*100))