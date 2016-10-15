package exUri.adHoc;

import java.util.Scanner;

public class Ex1107 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int altura = scanner.nextInt();
		int largura = scanner.nextInt();
		while (altura != 0 && largura != 0) {
			int now = 0;
			int back = altura;
			int soma = 0;
			for (int i = 0; i < largura; i++) {
				now = scanner.nextInt();
				if (now < back) {
					soma += back - now;
				}
				back = now;
			}
			System.out.println(soma);
			altura = scanner.nextInt();
			largura = scanner.nextInt();
		}
	}

}

/*
TLE
public class Ex1107 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int row = scanner.nextInt();
		int col = scanner.nextInt();
		while (row != 0 && col != 0) {
			int[] blocos = new int[col + 1];
			for (int i = 0; i < col; i++) {
				blocos[i] = scanner.nextInt();
			}
			blocos[col] = row;
			int[][] matrix = new int[row][col + 1];
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col + 1; j++) {
					if (blocos[j] > i) {
						matrix[i][j] = 1;
					} else {
						matrix[i][j] = 0;
					}
				}
			}
			boolean role = false;
			int total = 0;
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col + 1; j++) {
					if (matrix[i][j] == 0) {
						role = true;
					} else {
						if (role) {
							total++;
							role = false;
						}
					}
				}
			}
			System.out.println(total);
			row = scanner.nextInt();
			col = scanner.nextInt();
		}
	}

}
*/