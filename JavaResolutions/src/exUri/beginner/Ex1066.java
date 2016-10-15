package exUri.beginner;

import java.util.Scanner;

public class Ex1066 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int even = 0;
		int odd = 0;
		int pos = 0;
		int neg = 0;
		for (int i = 0; i < 5; i++) {
			int x = scanner.nextInt();
			if (x % 2 == 0) {
				even += 1;
			} else {
				odd += 1;
			}
			if (x > 0) {
				pos += 1;
			} else if (x < 0) {
				neg += 1;
			}
		}
		System.out.println(String.format("%d valor(es) par(es)", even));
		System.out.println(String.format("%d valor(es) impar(es)", odd));
		System.out.println(String.format("%d valor(es) positivo(s)", pos));
		System.out.println(String.format("%d valor(es) negativo(s)", neg));
	}

}
