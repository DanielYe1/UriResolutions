#include <iostream>
#include <algorithm>

using namespace std;

typedef struct animal {
    string name;
    int weight;
    int age;
    double height;

    animal(string a, int b, int c, double d) {
        name = a;
        weight = b;
        age = c;
        height = d;
    }

    animal() {
        name = "";
        weight = 0;
        age = 0;
        height = 0;
    }
} TA;

bool cmp(TA *a, TA *b) {
    if (a->weight > b->weight) {
        return true;
    } else if (a->weight < b->weight) {
        return false;
    } else {
        if (a->age < b->age) {
            return true;
        } else if (a->age > b->age) {
            return false;
        } else {
            if (a->height < b->height) {
                return true;
            } else if (a->height > b->height) {
                return false;
            } else {
                return a->name.compare(b->name);
            }
        }
    }
}

int main() {
    int times;
    scanf("%d", &times);
    int now = 1;

    for (int k = 0; k < times; ++k) {
        int dTotal, dUse;
        scanf("%d %d", &dTotal, &dUse);

        string name;
        int w, a;
        double h;
        TA *all[dTotal];
        for (int i = 0; i < dTotal; ++i) {
            cin >> name >> w >> a >> h;
            all[i] = new TA(name, w, a, h);
        }

        sort(all, all + dTotal, cmp);

        printf("CENARIO {%d}\n", now++);
        for (int j = 0; j < dUse; ++j) {
            cout << j + 1 << " - " << all[j]->name << endl;
        }
    }
    return 0;
}