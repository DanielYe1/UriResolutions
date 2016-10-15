package exUri.dataStructures;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Ex1025 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int qtMarbles = scanner.nextInt();
		int qtChoices = scanner.nextInt();
		int cases = 1;
		while (qtMarbles != 0 && qtChoices != 0) {
			System.out.println(String.format("CASE# %d:", cases));
			int[] marbles = new int[qtMarbles];
			int[] choices = new int[qtChoices];
			int indC = 0;
			boolean wasIn = false;
			for (int i = 0; i < qtMarbles; i++) {
				marbles[i] = scanner.nextInt();
			}
			for (int i = 0; i < qtChoices; i++) {
				choices[i] = scanner.nextInt();
			}
			Arrays.sort(marbles);
			while (indC < choices.length) {
				for (int i = 0; i < marbles.length; i++) {
					if (marbles[i] == choices[indC]) {
						System.out.println(String.format("%d found at %d", choices[indC], i + 1));
						wasIn = true;
						break;
					}
				}
				if (!wasIn) {
					System.out.println(String.format("%d not found", choices[indC]));
				}
				indC += 1;
				wasIn = false;
			}
			qtMarbles = scanner.nextInt();
			qtChoices = scanner.nextInt();
			cases += 1;
		}
	}

}