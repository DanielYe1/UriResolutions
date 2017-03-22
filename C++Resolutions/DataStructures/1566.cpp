#include <stdio.h>
#include <iostream>

using namespace std;

int main() {
    int n;
    cin >> n;
    int altura[231];
    for (int l = 0; l < n; ++l) {
        fill_n(altura,231,0);

        int size;
        scanf("%d",&size);
        int value;
        for (int i = 0; i < size; ++i) {
            scanf("%d",&value);
            altura[value] += 1;
        }

        bool first = true;
        for (int j = 20; j < 231; ++j) {
            for (int i = 0; i < altura[j]; ++i) {
                if (first) {
                    printf("%d",j);
                    first = false;
                } else {
                    printf(" %d",j);
                }
            }
        }
        cout << "\n";
    }

    return 0;
}