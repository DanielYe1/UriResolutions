package exUri.dataStructures;

import java.util.Scanner;

public class Ex2111 {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int num = scanner.nextInt();
			int[][] abaco = new int[7][9];
			for (int i = 0; i < 7; i++) {
				for (int j = 0; j < 9; j++) {
					abaco[i][j] = 1;
				}
			}
			for (int i = 0; i < 9; i++) {
				if (num % 10 < 5) {
					abaco[num % 10][i] = 0;
					abaco[5][i] = 0;
				} else {
					abaco[num % 10 - 5][i] = 0;
					abaco[6][i] = 0;
				}
				num /= 10;
			}

			for (int i = 6; i >= 5; i--) {
				for (int j = 8; j >= 0; j--) {
					System.out.print(abaco[i][j]);
				}
				System.out.println();
			}
			System.out.println("---------");

			for (int i = 0; i < 5; i++) {
				for (int j = 8; j >= 0; j--) {
					System.out.print(abaco[i][j]);
				}
				System.out.println();
			}
			if (scanner.hasNext()) {
				System.out.println();
			}
		}
	}
}