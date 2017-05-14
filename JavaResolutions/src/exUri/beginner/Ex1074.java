package exUri.beginner;

import java.util.Scanner;

public class Ex1074 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		for (int i = 0; i < times; i++) {
			int n = scanner.nextInt();
			if (n == 0) {
				System.out.println("NULL");
			} else if (n > 0) {
				if (n % 2 == 1) {
					System.out.println("ODD POSITIVE");
				} else {
					System.out.println("EVEN POSITIVE");
				}
			} else if (n < 0) {
				if (n % 2 == 0) {
					System.out.println("EVEN NEGATIVE");
				} else {
					System.out.println("ODD NEGATIVE");
				}
			}
		}
	}
}
