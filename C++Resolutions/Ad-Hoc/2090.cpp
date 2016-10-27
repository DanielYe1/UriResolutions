#include <stdio.h>
#include <iostream>
#include <string>

using namespace std;

int main() {
    int qtCrianca, index;
    scanf("%d %d", &qtCrianca, &index);
    while (qtCrianca != 0 && index != 0) {
        string *palavras = new string[qtCrianca];
        for (int i = 0; i < qtCrianca; i++) {
            cin >> palavras[i];
        }

        int count = 0;


        for (int j = qtCrianca; j >= 0; j--) {
            for (int i = 0; i < qtCrianca - j; i++) {
                count++;
                if (count == index) {
                    cout << palavras[i] << endl;
                    break;
                }
            }
            if (count == index) {
                break;
            }
        }
        scanf("%d %d", &qtCrianca, &index);
    }
    return 0;
}