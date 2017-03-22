#include <iostream>
#include <iomanip>

using namespace std;

int main() {
    double init;
    double final;

    cin >> init >> final;

    double dif = ((final / init) - 1) * 100;

    cout << fixed << setprecision(2) << dif << '%' << endl;
    return 0;
}