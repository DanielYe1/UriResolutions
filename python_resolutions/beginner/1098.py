import math

I = 0
while I < 1.8:
    for i in range(3):
        if I % 1 == 0:
            print("I={0} J={1}".format(math.floor(I), math.floor(1+i+I)))
        else:
            print("I={0:.1f} J={1:.1f}".format(I, 1+i+I))
    I +=0.2
I +=0.2
for i in range(3):
    print("I={0} J={1}".format(math.floor(I), math.floor(1+i+I)))