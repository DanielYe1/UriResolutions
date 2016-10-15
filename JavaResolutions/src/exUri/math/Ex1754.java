package exUri.math;

import java.util.Scanner;

public class Ex1754 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long times = scanner.nextInt();
		long x, y;
		for (int i = 0; i < times; i++) {
			x = scanner.nextLong();
			y = scanner.nextLong();
			if (x < y) {
				System.out.println(2);
			} else if (x % y != 0) {
				System.out.println((long) (x / y) + 1);
			} else {
				System.out.println((long) x / y);
			}
		}
	}

}
