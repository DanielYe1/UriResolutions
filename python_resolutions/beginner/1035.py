a = input().split()
a, b, c, d = int(a[0]), int(a[1]), int(a[2]), int(a[3])
if b > c and d > a and (c+d)>(a+b) and c >0 and d>0 and a%2==0:
    print("Valores aceitos")
else:
    print("Valores nao aceitos")
