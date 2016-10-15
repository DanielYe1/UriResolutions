n = int(input())
m = 0
while n!=0:
    matrix = [[0 for i in range(n)] for j in range(n)]
    for i in range(n):
        for j in range(n):
            matrix[j][i] = 2 ** i

    for i in range(1,n):
        for j in range(n):
            matrix[i][j] = matrix[i-1][j]*2

    cond = matrix[n-1][n-1]

    while cond !=0:
        m +=1
        cond = cond//10

    String = ("{:" + str(m) + "d}")
    for i in range(n):
        for j in range(n):
            if j == n-1:
                print(String.format(matrix[i][j]))
            else:
                print(String.format(matrix[i][j]),end=' ')
    m = 0
    print()
    n = int(input())
