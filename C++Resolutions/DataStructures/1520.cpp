#include <stdio.h>
#include <iostream>

using namespace std;

int main() {
    int n;
    while (cin >> n) {
        int low, high;
        int size[10001];
        fill_n(size, 10001, 0);
        for (int i = 0; i < n; i++) {
            cin >> low >> high;
            for (int j = low; j <= high; j++) {
                size[j]++;
            }
        }

        int ans;
        cin >> ans;

        if (size[ans] == 0) {
            printf("%d not found\n", ans);
        } else {
            int total = 0;
            for (int i = 0; i < ans; i++) {
                total += size[i];
            }
            printf("%d found from %d to %d\n", ans, total, total + size[ans] - 1);
        }
    }
    return 0;
}