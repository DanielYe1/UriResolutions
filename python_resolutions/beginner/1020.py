import math

a = int(input())
year = math.floor(a / 365)
n = a % 365
month = math.floor(n/ 30)
day = n % 30

print("{0} ano(s)".format(year))
print("{0} mes(es)".format(month))
print("{0} dia(s)".format(day))