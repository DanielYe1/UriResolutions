#include <iostream>
#include <string>

using namespace std;

int main()
{
	int times, year;
	cin >> times;
	for (int i = 0; i < times; i++)
	{
		cin >> year;
		if (year < 2015) {
			cout << 2015 - year << " D.C." << endl;
		}
		else {
			cout << abs(2014 - year) << " A.C." << endl;
		}
	}
	return 0;
}