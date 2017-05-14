#include <iostream>
#include <stdio.h>

using namespace std;

int main() {
    int total;
    scanf("%d", &total);
    int n = total / 2;
    int atual = total;
    int count = 0;

    do {
        if (atual > n) {
            atual = 2 * (atual - 1 - n) + 1;
        } else if (atual <= n) {
            atual *= 2;
        }
        count += 1;
    } while (atual != total);
    cout << count << endl;

    return 0;
}
