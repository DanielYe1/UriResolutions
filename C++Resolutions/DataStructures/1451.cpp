#include <stdio.h>
#include <iostream>
#include <string>
#include <list>

using namespace std;

int main() {
	while (cin) {
		string beiju;
		cin >> beiju;
		list<char> sentence;
		list<char>::iterator modifier;
		bool home = false;
		for (int i = 0; i < beiju.length(); ++i) {
			if (beiju[i] == '[') {
				home = true;
				modifier = sentence.begin();
			} else if (beiju[i] == ']') {
				home = false;
				modifier = sentence.end();
			} else if (home) {
				sentence.insert(modifier, beiju[i]);
			} else {
				sentence.push_back(beiju[i]);
			}
		}
		for (modifier = sentence.begin(); modifier != sentence.end();
				modifier++) {
			printf("%c", *modifier);
		}
		if (cin) {
			printf("\n");
		}
	}
	return 0;
}
