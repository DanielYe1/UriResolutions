#include <iostream>
#include <string>
 
using namespace std;
 
int main() {
	int a;
	string sheldon, raj;
	cin >> a;
	for (int r = 0; r < a; ++r) {
		cin >> sheldon >> raj;
		if (sheldon == raj) {
			cout << "Caso #" << r + 1 << ": De novo!" << endl;
		}else if ((sheldon == "tesoura" && raj == "papel") || (sheldon == "papel" && raj == "pedra") ||
			(sheldon == "pedra" && raj == "lagarto") || (sheldon == "lagarto" && raj == "Spock") ||
			(sheldon == "Spock" && raj == "tesoura") || (sheldon == "tesoura" && raj == "lagarto") ||
			(sheldon == "lagarto" && raj == "papel") || (sheldon == "papel" && raj == "Spock") ||
			(sheldon == "Spock" && raj == "pedra") || (sheldon == "pedra" && raj == "tesoura")) 
		{
				cout << "Caso #" << r + 1 << ": Bazinga!" << endl;
			}
		else {
			cout << "Caso #" << r + 1 << ": Raj trapaceou!" << endl;
			}
	}
	return 0;
}