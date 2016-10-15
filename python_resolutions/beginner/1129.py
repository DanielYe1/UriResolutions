loop = int(input())

while loop !=0:
    resp = 0
    count = 0
    nm = 0
    for k in range(loop):
        x = [int(i) for i in input().split()]
        for j in x:
            if j > 127:
                resp += 1
                nm +=1
            else:
                count = nm
                nm +=1

        if resp != 4:
            print('*')
        else:
            if count == 0:
                print('A')
            if count == 1:
                print('B')
            if count == 2:
                print('C')
            if count == 3:
                print('D')
            if count == 4:
                print('E')
        nm = 0
        count = 0
        resp = 0

    loop = int(input())