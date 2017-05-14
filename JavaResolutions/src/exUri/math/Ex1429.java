package exUri.math;

import java.util.Scanner;

public class Ex1429 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] fatorial = new int[10];
		int num = 1;
		for (int j = 1; j < 10; j++) {
			num = num * j;
			fatorial[j - 1] = num;
		}
		String number = scanner.next();
		while (!number.equals("0")) {
			int total = 0;
			for (int i = 0; i < number.length(); i++) {
				total += (number.charAt(i) - 48) * fatorial[number.length() - i - 1];
			}
			System.out.println(total);
			number = scanner.next();
		}
	}

}
