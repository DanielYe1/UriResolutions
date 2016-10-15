times = int(input())
for i in range(times):
    n = int(input())
    if n ==0:
        print("NULL")
    elif n >0:
        if n % 2 == 1:
            print("ODD POSITIVE")
        else:
            print("EVEN POSITIVE")
    elif n<0:
        if n % 2 == 1:
            print("ODD NEGATIVE")
        else:
            print("EVEN NEGATIVE")