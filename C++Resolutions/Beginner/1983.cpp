#include <stdio.h>

using namespace std;

int main() {
    int n;
    scanf("%d", &n);

    double hValue = 0;
    int hId = 0;
    double tempValue=0;
    int tempId=0;
    for (int i = 0; i < n; ++i) {
        scanf("%d %lf", &tempId, &tempValue);
        if (tempValue > hValue) {
            hValue = tempValue;
            hId = tempId;
        }
    }
    if (hValue >= 8) {
        printf("%d\n", hId);
    } else {
        printf("Minimum note not reached\n");
    }

    return 0;
}