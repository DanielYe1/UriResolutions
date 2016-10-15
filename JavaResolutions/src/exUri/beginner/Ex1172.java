package exUri.beginner;

import java.util.Scanner;

public class Ex1172 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] x = new int[10];
		for (int i = 0; i < 10; i++) {
			int k = scanner.nextInt();
			if (k < 1) {
				System.out.println(String.format("X[%d] = 1", i));
			} else {
				System.out.println(String.format("X[%d] = %d", i, k));
			}
		}

	}

}
