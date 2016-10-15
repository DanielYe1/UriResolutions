#include <iostream>
 
using namespace std;
 
int main() {
   int a,b;
   int lower = 0;
   int c = 0;
   cin >> a;
   for (int i = 0; i < a; i++)
   {
   	cin >> b;
   	if(i == 0){
   		lower = b;
   		c = i;
   	}
   	if(b < lower){
   		lower = b;
   		c = i;
   	}
   }
   cout << c+1 <<endl;
   
   return 0;
}