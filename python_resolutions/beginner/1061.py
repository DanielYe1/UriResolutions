import math

d1 = input().split()
h1 = [int(i) for i in [j for j in input().split() if j is not ':']]
d2 = input().split()
h2 = [int(i) for i in [j for j in input().split() if j is not ':']]

seg1 = int(d1[1])*86400 + h1[0]*3600 + h1[1]*60 + h1[2]
seg2 = int(d2[1])*86400 + h2[0]*3600 + h2[1]*60 + h2[2]
segr = seg2-seg1

seg = segr%60
min = math.floor(segr/60)%60
hour = math.floor(segr/3600)%24
day = math.floor(segr/86400)

print("{0} dia(s)".format(day))
print("{0} hora(s)".format(hour))
print("{0} minuto(s)".format(min))
print("{0} segundo(s)".format(seg))