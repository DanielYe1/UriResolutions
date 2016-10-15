x = input().split()
a = float(x[0])
b = float(x[1])
c = float(x[2])

if abs(b - c) < a < b + c and abs(a - c) < b < a + c and abs(a - b) < c < a + b:
    print("Perimetro = {0:.1f}".format(a+b+c))
else:
    print("Area = {0:.1f}".format((a+b)*c/2))
