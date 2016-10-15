package exUri.beginner;

import java.util.Scanner;

public class Ex1038 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] prices = new double[5];
		for (int i = 0; i < 3; i++) {
			prices[i] = 4 + 0.5 * i;
		}
		prices[3] = 2;
		prices[4] = 1.5;
		int x = scanner.nextInt()-1;
		int y = scanner.nextInt();
		System.out.println(String.format("Total: R$ %.2f", prices[x] * y));
	}

}
