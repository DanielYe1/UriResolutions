#include <stdio.h>
#include <iostream>
#include <set>
#include <string>

using namespace std;

int main() {
    set<string> dict;
    string word = "";
    bool isFinal;
    string original;
    while (cin) {
        cin >> original;
        char digit;
        for (int i = 0; i < original.length(); i++) {
            digit = tolower(original.at(i));
            if ((int) digit > 96 && (int) digit < 123) {
                word += digit;
                isFinal = true;
            } else {
                dict.insert(word);
                word = "";
                isFinal = false;
            }
        }
        if (isFinal) {
            dict.insert(word);
            word = "";
        }
    }
    for (set<string>::iterator i = dict.begin(); i != dict.end(); ++i) {
        if (i != dict.begin()) {
            cout << *i << endl;
        }
    }

    return 0;
}
