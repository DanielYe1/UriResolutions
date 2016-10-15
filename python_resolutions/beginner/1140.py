sentence = input().lower()
k = sentence[0]
truth = True
while sentence != '*':
    for i in range(len(sentence)):
        if sentence[i] == ' ':
            if k != sentence[i+1]:
                truth = False

    if truth:
        print('Y')
    else:
        print('N')

    sentence = input().lower()
    k = sentence[0]
    truth = True