package exUri.beginner;

import java.util.Scanner;

public class Ex1153 {

	static int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(factorial(scanner.nextInt()));

	}

}
