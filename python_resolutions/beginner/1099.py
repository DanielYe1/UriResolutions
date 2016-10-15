x = int(input())
for i in range(x):
    n = [int(i) for i in input().split()]
    n.sort()
    count = 0
    for i in range(n[0]+1,n[1]):
        if i % 2==1:
            count += i
    print(count)