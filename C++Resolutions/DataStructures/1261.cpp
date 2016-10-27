#include <iostream>
#include <map>
#include <string>

using namespace std;

int main() {
    map<string, long> words;
    int qtWords, qtSentences;
    cin >> qtWords >> qtSentences;
    string word;
    long value;

    for (int i = 0; i < qtWords; ++i) {
        cin >> word >> value;
        words[word] = value;
    }

    string palavra;
    long total = 0;
    for (int j = 0; j < qtSentences; ++j) {
        cin >> palavra;
        while (palavra != ".") {
            if (words.find(palavra) != words.end()) {
                total += words.at(palavra);
            }
            cin >> palavra;
        }
        cout << total << endl;
        total = 0;
    }

    return 0;
}