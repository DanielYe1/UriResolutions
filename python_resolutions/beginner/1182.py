col = int(input())
operation = input()
matrix = [[float(input()) for x in range(12)] for y in range(12)]
tot = 0
for i in range(12):
    tot += matrix[i][col]
if operation == "S":
    print("{0:.1f}".format(tot))
elif operation =="M":
    print("{0:.1f}".format(tot/12))