#include <iostream>
#include <string>

using namespace std;

int main()
{
	char frase[] = "LIFE IS NOT A PROBLEM TO BE SOLVED";
	int a;
	cin >> a;
	for (int i = 0; i < a; ++i)
	{
		cout << frase[i];
	}
	cout << endl;
   return 0;
}