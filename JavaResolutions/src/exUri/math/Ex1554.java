package exUri.math;

import java.util.Scanner;

public class Ex1554 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		for (int i = 0; i < times; i++) {
			double lower = 5000;
			int count = 0;
			int bolas = scanner.nextInt();
			int brancaX = scanner.nextInt();
			int brancaY = scanner.nextInt();
			for (int j = 0; j < bolas; j++) {
				int bolaX = scanner.nextInt();
				int bolaY = scanner.nextInt();
				if (Math.sqrt((bolaX - brancaX) * (bolaX - brancaX) + (bolaY - brancaY) * (bolaY - brancaY))
						+ 0.01 < lower) {
					lower = Math.sqrt((bolaX - brancaX) * (bolaX - brancaX) + (bolaY - brancaY) * (bolaY - brancaY));
					count = j;
				}
			}
			System.out.println(count + 1);
		}
	}

}
