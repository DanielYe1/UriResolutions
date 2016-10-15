even = 0
odd = 0
pos = 0
neg = 0
for i in range(5):
    x = int(input())
    if x % 2 == 0:
        even += 1
    else:
        odd += 1
    if x > 0:
        pos += 1
    elif x < 0:
        neg += 1

print("{0} valor(es) par(es)".format(even))
print("{0} valor(es) impar(es)".format(odd))
print("{0} valor(es) positivo(s)".format(pos))
print("{0} valor(es) negativo(s)".format(neg))
