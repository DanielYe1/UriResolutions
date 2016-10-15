x = int(input())
y = int(input())
a = [x,y+1]
a.sort()
sum = 0
for i in range(a[0], a[1]):
    if i % 2 == 1:
        sum += i

print(sum)
