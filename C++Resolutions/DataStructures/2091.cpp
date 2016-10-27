#include <iostream>

using namespace std;

int main() {
    int times;
    cin >> times;
    while (times != 0) {
        long val[100000];
        long num = 0;
        for (int j = 0; j < times; j++) {
            cin >> num;
            val[num]++;
        }

        for (int k = 0; k < 100000; k++) {
            if (val[k] % 2 == 1) {
                cout << k << endl;
                break;
            }
        }
        cin >> times;
    }

    return 0;
}