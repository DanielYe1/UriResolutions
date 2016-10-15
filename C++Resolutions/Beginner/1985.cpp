#include <iostream>
#include <string>
#include <iomanip>

using namespace std;

int main()
{
	int times;
	float menu[5];
	menu[0] = 1.5;
	for (int i = 1; i < 5; i++)
	{
		menu[i] = menu[i - 1] + 1;
	}
	cin >> times;
	int cod, qt;
	float total = 0;
	for (int i = 0; i < times; i++)
	{
		cin >> cod >> qt;
		total += menu[cod - 1001] * qt;
	}
	std::cout << std::setprecision(2) << fixed << total << endl;

	return 0;
}