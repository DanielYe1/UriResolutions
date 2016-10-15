package exUri.adHoc;

import java.util.Scanner;

public class Ex1441 {

	static int threeplusn1(int x, int k) {
		if (x == 1) {
			return k;
		} else if (x % 2 == 1) {
			if (3 * x + 1 > k) {
				return threeplusn1(3 * x + 1, 3 * x + 1);
			} else {
				return threeplusn1(3 * x + 1, k);
			}
		} else {
			return threeplusn1(x / 2, k);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int j = scanner.nextInt();
		while (j != 0) {
			int ans = threeplusn1(j, j);
			System.out.println(ans);
			j = scanner.nextInt();
		}
	}

}
