#include <iostream>
 
using namespace std;
 
int mdc(int a,int b)
{
 if(b == 0)
  return a;
 else
  return mdc(b,a%b);
}

int main() {
	int times;
	int x,y;
	cin >> times;
	for (int i = 0; i < times; ++i) {
		cin >> x >> y;
		cout << mdc(x,y) << endl;
	}
	return 0;
}