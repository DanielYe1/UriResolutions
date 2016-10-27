#include <stdio.h>
#include <iostream>
#include <map>
#include <string>

using namespace std;

int main() {
    int times;
    cin >> times;
    string teste;
    for (int k = 0; k < times; ++k) {
        int qtWords, qtAns;
        cin >> qtWords >> qtAns;
        map<string, string> dict;
        string key, value;
        getline(cin, teste);

        for (int i = 0; i < qtWords; ++i) {
            getline(cin, key);
            getline(cin, value);
            dict[key] = value;
        }

        string sentence;
        string temp;
        for (int j = 0; j < qtAns; ++j) {
            getline(cin, sentence);
            for (int i = 0; i <= sentence.length(); i++) {
                if (sentence[i] != 32 && i != sentence.length()) {
                    temp += sentence[i];
                } else {
                    if (dict.find(temp) == dict.end()) {
                        if (i == sentence.length()) {
                            cout << temp << endl;
                        } else {
                            cout << temp << " ";
                        }
                    } else {
                        if (i == sentence.length()) {
                            cout << dict.at(temp) << endl;
                        } else {
                            cout << dict.at(temp) << " ";
                        }
                    }
                    temp = "";
                }
            }
            temp = "";
        }
        cout << endl;
    }
    return 0;
}