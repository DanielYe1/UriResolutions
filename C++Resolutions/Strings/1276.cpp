#include <iostream>
#include <stdio.h>
#include <string>

using namespace std;

int main() {
    string tudo;
    while (getline(cin, tudo)) {
        bool existe[27];

        for (int k = 0; k < 27; k++) {
            existe[k] = false;
        }

        for (int i = 0; i < tudo.length(); i++) {
            if (tudo[i] - 97 >= 0 && tudo[i] - 97 <= 26) {
                existe[tudo[i] - 97] = true;
            }
        }

//        for (int l = 0; l < 27; l++) {
//            cout << existe[l] << "|";
//        }

        int first = 0;
        bool firstInt = true;
        bool jaOcorreu = false;
        bool firstPrint = true;
        int last = 0;
        for (int j = 0; j < 27; j++) {
            if (existe[j]) {
                if (firstInt) {
                    first = j;
                    firstInt = false;
                    jaOcorreu = true;
                }
            } else {
                if (jaOcorreu) {
                    if (firstPrint) {
                        cout << static_cast<char>(first + 97) << ":" << static_cast<char>(j + 96);
                        firstPrint = false;
                    } else {
                        cout << ", " << static_cast<char>(first + 97) << ":" << static_cast<char>(j + 96);
                    }
                    firstInt = true;
                    jaOcorreu = false;
                }
            }
        }
        cout << endl;

    }

    return 0;
}