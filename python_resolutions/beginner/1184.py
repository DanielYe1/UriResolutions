operation = input()
matrix = [[float(input()) for x in range(12)] for y in range(12)]
tot = 0
count = 0
for i in range(12):
    for j in range(12):
        if (i>j):
            tot += matrix[i][j]
            count += 1
if operation == "S":
    print("{0:.1f}".format(tot))
elif operation =="M":
    print("{0:.1f}".format(tot/count))