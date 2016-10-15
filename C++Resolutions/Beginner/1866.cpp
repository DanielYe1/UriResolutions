#include <iostream>
 
using namespace std;
 
int main()
{
	int times, num;
	scanf("%d", &times);
	for (int i = 0; i < times; i++)
	{
		scanf("%d", &num);
		printf("%d\n", num%2);
	}
	return 0;
}