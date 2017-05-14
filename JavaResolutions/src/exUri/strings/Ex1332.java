package exUri.strings;

import java.util.Scanner;

public class Ex1332 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		for (int i = 0; i < times; i++) {
			String word = scanner.next();
			if (word.length() == 5) {
				System.out.println(3);
			} else if ((word.charAt(0) == 'o' && word.charAt(1) == 'n')
					|| (word.charAt(0) == 'o' && word.charAt(2) == 'e')
					|| (word.charAt(2) == 'e' && word.charAt(1) == 'n')) {
				System.out.println(1);
			} else {
				System.out.println(2);
			}
		}
	}
}
