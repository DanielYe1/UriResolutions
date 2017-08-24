#include <iostream>

using namespace std;

int qt[51];
int sobra[51];

void create(int toys, int peso, int qtToys[], int qtKg[], int ind, int size, int rest) {
    if (peso > 50 || ind > size) {
        return;
    }

    if (qt[peso] < toys || qt[peso] == -1) {
        qt[peso] = toys;
        sobra[peso] = rest;
    }

    create(toys, peso, qtToys, qtKg, ind + 1, size, rest + 1);
    create(toys + qtToys[ind], peso + qtKg[ind], qtToys, qtKg, ind + 1, size, rest);
}

int main() {
    int times;
    cin >> times;

    for (int l = 0; l < times; ++l) {

        for (int k = 0; k < 51; ++k) {
            qt[k] = -1;
        }

        int qtP;
        cin >> qtP;

        int qtToy[qtP], qtKg[qtP];

        for (int i = 0; i < qtP; ++i) {
            scanf(" %d %d", &qtToy[i], &qtKg[i]);
        }

        create(0, 0, qtToy, qtKg, 0, qtP, 0);

        int high = qt[0];
        int ind = 0;
        for (int j = 0; j < 51; ++j) {
            if (high < qt[j]) {
                high = qt[j];
                ind = j;
            }
        }

        printf("%d brinquedos\n", qt[ind]);
        printf("Peso: %d kg\n", ind);
        printf("sobra(m) %d pacote(s)\n\n", sobra[ind]);
    }
    return 0;
}