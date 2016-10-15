#include <iostream>
#include <string>

using namespace std;

int main()
{
	int times, weight;
	cin >> times;
	string name;
	for (int i = 0; i < times; i++)
	{
		cin >> name >> weight;
		if (name == "Thor") {
			cout << "Y" << endl;
		}
		else {
			cout << "N" << endl;
		}
	}
	return 0;
}