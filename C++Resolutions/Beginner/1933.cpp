#include <iostream>
#include <string>

using namespace std;

int main()
{
	int x, y;
	cin >> x >> y;
	if (x == y) {
		cout << x << endl;
	}
	else {
		if (x > y) {
			cout << x << endl;
		}
		else {
			cout << y << endl;
		}
	}
	return 0;
}