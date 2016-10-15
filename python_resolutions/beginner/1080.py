highn = 0
countn = 0
for i in range(1, 101):
    n = int(input())
    if n > highn:
        highn = n
        countn = i
print(highn)
print(countn)