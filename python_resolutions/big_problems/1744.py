x = [int(i) for i in input().split()]
custo = x[0]
menor = x[0]-x[1]
palavra = input()
total = 0
black = []
white = []
limit = palavra.count("B")
for i in range(len(palavra)):
    if i < limit:
        black.append(palavra[i])
    else:
        white.append(palavra[i])
black.reverse()
for i in range(len(white)):
    if white[i] == "B":
        for j in range(len(black)):
            if black[j] == "W":
                white[i] = "W"
                black[j] = "B"
                count = i + j + 1
                if count * menor < custo:
                    total+= count*menor
                    break
                else:
                    total += custo
                    break
print(total)
