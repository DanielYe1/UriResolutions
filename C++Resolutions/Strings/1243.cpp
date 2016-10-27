//
// Created by daniel on 10/17/16.
//

#include <iostream>
#include <string>

using namespace std;


bool isLetra(char letra) {
    return (tolower(letra) <= 122 && tolower(letra) >= 97);
}

int main() {

    while (cin) {
        string frase;
        getline(cin, frase);

        int totalWords = 0;
        int totalChar = 0;

        int tempChar = 0;
        char currentChar;

        for (int i = 0; i < frase.length(); i++) {
            currentChar = frase[i];
            if (isLetra(currentChar)) {
                tempChar++;
            } else if (currentChar == '.') {
                if (i == frase.length() - 1 || frase[++i] == ' ') {
                    if (tempChar > 0) {
                        totalWords++;
                        totalChar += tempChar;
                        tempChar = 0;
                    }
                } else {
                    tempChar = 0;
                    for (i = i + 1; i < frase.length() && frase[i] != ' '; i++);
                }

            } else if (currentChar == ' ') {
                if (tempChar > 0) {
                    totalChar += tempChar;
                    tempChar = 0;
                    totalWords++;
                }
            } else {
                tempChar = 0;
                for (i = i + 1; i < frase.length() && frase[i] != ' '; i++);
            }
        }

        if (tempChar > 0) {
            totalChar += tempChar;
            totalWords++;
        }


        int ans;
        if (totalWords == 0) {
            ans = 250;
        } else {
            ans = totalChar / totalWords;
            if (ans <= 3) {
                ans = 250;
            } else if (ans >= 6) {
                ans = 1000;
            } else {
                ans = 500;
            }
        }
        cout << ans << endl;

    }
    return 0;
}