//
// Created by daniel on 3/10/17.
//

#include <stdio.h>
#include <iostream>
#include <stack>

using namespace std;


// incomplete
int main() {

    int nDrivers;
    int nCars;
    scanf("%d %d", &nDrivers, &nCars);

    int start;
    int end;
    int driversTime[nDrivers * 2];
    for (int i = 0; i < nDrivers * 2; i += 2) {
        scanf("%d %d", &start, &end);
        driversTime[i] = start;
        driversTime[i + 1] = end;
    }

    stack<int> parking;
    int pushCount = 0;
    parking.push(pushCount);
    // push in order

    for (int j = 0; j <= 100000; j++) {


        if (!parking.empty()) {
            // retirar na pilha
            if (j == driversTime[parking.top() + 1]) {
                parking.pop();
            }
        }



        // parte de colocar na pilha
        if (driversTime[pushCount] == j) {
            pushCount += 1;
            parking.push(pushCount);
        }
    }


    return 0;
}