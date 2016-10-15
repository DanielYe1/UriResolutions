row = int(input())
operation = input()
matrix = [[float(input()) for x in range(12)] for y in range(12)]
tot = 0
for i in range(12):
    tot += matrix[row][i]
if operation == "S":
    print(tot)
elif operation =="M":
    print(tot/12)