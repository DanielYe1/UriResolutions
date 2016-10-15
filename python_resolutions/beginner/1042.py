original = input().split()
new = [int(i) for i in original]

new.sort()
for i in new:
    print(i)

print('')

for k in original:
    print(k)
