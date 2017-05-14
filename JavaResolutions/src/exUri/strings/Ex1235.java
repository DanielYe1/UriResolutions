package exUri.strings;

import java.util.Scanner;

public class Ex1235 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int times = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < times; i++) {
			String word = scanner.nextLine();
			int size = word.length() / 2;
			String sub1 = new StringBuilder(word.substring(0, size)).reverse().toString();
			String sub2 = new StringBuilder(word.substring(size, word.length())).reverse().toString();
			System.out.println(sub1 + sub2);
		}
	}

}
