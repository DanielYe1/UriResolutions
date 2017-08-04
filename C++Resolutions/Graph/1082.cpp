#include <iostream>
#include <malloc.h>

using namespace std;

int *init(int n) {
    int *arr = (int *) malloc(sizeof(int) * n);
    for (int i = 0; i < n; ++i) {
        arr[i] = i;
    }
    return arr;
}

int find(int *parent, int a, int b) {
    return parent[a] == parent[b];
}

void Union(int parent[], int size, int x, int y) {
    int temp = parent[x];
    for (int i = 0; i < size; ++i) {
        if (parent[i] == temp) {
            parent[i] = parent[y];
        }
    }
}

int main() {
    int times;
    cin >> times;
    for (int l = 0; l < times; ++l) {
        int total, connections;
        cin >> total >> connections;

        int *arr = init(total);
        int *used = (int *) malloc(sizeof(int) * total);
        for (int j = 0; j < total; ++j) {
            used[j] = 0;
        }
        char a, b;
        for (int i = 0; i < connections; ++i) {
            cin >> a >> b;
            Union(arr, total, a - 97, b - 97);
        }

        printf("Case #%d:\n", l + 1);
        int comp = 0;
        for (int k = 0; k < total; k++) {
            if (!used[k]) {
                comp++;
                cout << static_cast<char>(k + 97) << ",";
                for (int i = k + 1; i < total; i++) {
                    if (!used[i] && find(arr, k, i)) {
                        cout << static_cast<char>(i + 97) << ",";
                        used[i] = 1;
                    }
                }
                cout << endl;
            }
        }
        printf("%d connected components\n\n", comp);
    }

    return 0;
}