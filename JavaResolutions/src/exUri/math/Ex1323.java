package exUri.math;

import java.util.Scanner;

public class Ex1323 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		while (number != 0) {
			System.out.println(number * (number + 1) * (2 * number + 1) / 6);
			number = scanner.nextInt();
		}
	}
}
