package exUri.adHoc;

import java.util.Scanner;

public class Ex1125 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int qtTorneios = scanner.nextInt();
		int qtPlayers = scanner.nextInt();
		while (qtTorneios != 0 && qtPlayers != 0) {
			Integer[][] torneios = new Integer[qtTorneios][qtPlayers];
			for (int i = 0; i < qtTorneios; i++) {
				for (int j = 0; j < qtPlayers; j++) {
					torneios[i][j] = scanner.nextInt();
				}
			}
			int qtScores = scanner.nextInt();
			for (int i = 0; i < qtScores; i++) {
				int[] pontos = new int[qtPlayers];
				int scores = scanner.nextInt();
				int lugar = 1;
				for (int j = 0; j < scores; j++) {
					int ponto = scanner.nextInt();
					for (int k = 0; k < qtTorneios; k++) {
						for (int k2 = 0; k2 < qtPlayers; k2++) {
							if (torneios[k][k2] == lugar) {
								pontos[k2] += ponto;
							}
						}
					}
					lugar += 1;

				}
				int temp = 0;
				int maior = 0;
				for (int k = 0; k < qtPlayers; k++) {
					if (pontos[k] > temp) {
						temp = pontos[k];
						maior = k + 1;
					}
				}
				StringBuilder arroz = new StringBuilder();
				for (int j = 0; j < qtPlayers; j++) {
					if (pontos[j] == temp) {
						arroz.append(String.format("%d ", j + 1));
					}
				}
				arroz.deleteCharAt(arroz.length() - 1);
				System.out.println(arroz);
			}
			qtTorneios = scanner.nextInt();
			qtPlayers = scanner.nextInt();
		}
	}
}
