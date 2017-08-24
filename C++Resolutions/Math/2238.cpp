#include <iostream>
#include <vector>
#include <cmath>
#include <algorithm>

using namespace std;

int main() {
    int div, nDiv, mul, nMul;

    cin >> div >> nDiv >> mul >> nMul;
    vector<int> divs;
    int ans = -1;

    int raiz = sqrt(mul);

    for (int i = 1; i <= raiz; ++i) {
        if (mul % i == 0) {
            divs.push_back(i);
            divs.push_back(mul / i);
        }
    }

    sort(divs.begin(), divs.end());

    int temp;
    for (int j = 0; j < divs.size(); ++j) {
        temp = divs[j];
        if (temp % div == 0 && temp % nDiv != 0 && nMul % temp != 0) {
            ans = temp;
            break;
        }
    }

    cout << ans << endl;

    return 0;
}