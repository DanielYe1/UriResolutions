#include <stdio.h>
#include <iostream>
#include <math.h>

using namespace std;

int main() {
    int times;
    cin >> times;
    int count = 1;
    long people = 0;
    long water = 0;
    long media = 0;
    while (times != 0) {
        double totWater = 0;
        double totPeople = 0;
        long waterPerPeople[201];
        for (int i = 0; i <= 200; ++i) {
            waterPerPeople[i] = 0;
        }
        for (int i = 0; i < times; ++i) {
            cin >> people >> water;
            media = water / people;
            totWater += water;
            totPeople += people;
            waterPerPeople[media] = people;
        }
        printf("Cidade# %d:\n", count);
        bool first = true;
        for (int i = 0; i <= 200; ++i) {
            if (waterPerPeople[i] != 0) {
                if (first) {
                    printf("%d-%d", waterPerPeople[i], i);
                    first = false;
                } else {
                    printf(" %d-%d", waterPerPeople[i], i);
                }
            }
        }
        printf("\n");
        printf("Consumo medio: %.2lf m3.\n",
               floor(100 * (float) totWater / totPeople) / 100);
        cin >> times;
        count++;
        if (times != 0) {
            printf("\n");
        }

    }
    return 0;
}
