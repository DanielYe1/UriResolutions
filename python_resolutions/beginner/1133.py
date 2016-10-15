a = int(input())
b = int(input())
if a > b:
    k = a
    a = b
    b = k

for i in range(a+1, b):
    if i % 5 == 2 or i % 5 == 3:
        print(i)
