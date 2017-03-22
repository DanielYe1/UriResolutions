#include <iostream>
#include <map>
#include <string>

using namespace std;

int main() {

    int n;
    cin >> n;
    while (n != 0) {
        map<string, string> lista;
        string nome, assinatura;
        for (int i = 0; i < n; i++) {
            cin >> nome >> assinatura;
            lista[nome] = assinatura;
        }

        int m;

        cin >> m;

        int total = 0;
        for (int j = 0; j < m; j++) {
            cin >> nome >> assinatura;
            int erro = 0;
            for (int i = 0; i < assinatura.length(); ++i) {
                if (lista[nome][i] != assinatura[i]) {
                    erro += 1;
                    if (erro > 1) {
                        total++;
                        break;
                    }
                }
            }
        }
        cout << total << "\n";
        cin >> n;
    }
    return 0;
}