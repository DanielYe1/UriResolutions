package exUri.math;

import java.util.Scanner;

public class Ex1028 {

	public static int gCd(int x, int y) {
		if (y == 0) {
			return x;
		}
		return gCd(y, x % y);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		for (int i = 0; i < times; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			System.out.println(gCd(x, y));
		}
	}
}