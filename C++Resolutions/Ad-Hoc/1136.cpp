#include <iostream>

using namespace std;

int main() {
    int bingo;
    int times;
    cin >> bingo >> times;
    while (bingo != 0 && times != 0) {
        bool ans = true;
        int *valores = new int[bingo+1];
        int *num = new int[times];
        int temp;
        for (int i = 0; i < times; ++i) {
            cin >> temp;
            num[i] = temp;
        }
        for (int j = 0; j < times; ++j) {
            for (int i = j; i < times; ++i) {
                valores[abs(num[j] - num[i])] = 1;
            }
        }

        for (int l = 1; l <= bingo; ++l) {
            if (valores[l] != 1) {
                ans = false;
            }
        }

        if (ans) {
            cout << "Y" << endl;
        } else {
            cout << "N" << endl;
        }
        cin >> bingo >> times;
    }
    return 0;
}
