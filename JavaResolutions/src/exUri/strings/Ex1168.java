package exUri.strings;

import java.util.Scanner;

public class Ex1168 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		for (int j = 0; j < times; j++) {
			String numbers = scanner.next();
			int count = 0;
			for (int i = 0; i < numbers.length(); i++) {
				if (numbers.charAt(i) == '1') {
					count += 2;
				} else if (numbers.charAt(i) == '7') {
					count += 3;
				} else if (numbers.charAt(i) == '4') {
					count += 4;
				} else if (numbers.charAt(i) == '2' || numbers.charAt(i) == '5' || numbers.charAt(i) == '3') {
					count += 5;
				} else if (numbers.charAt(i) == '6' || numbers.charAt(i) == '9' || numbers.charAt(i) == '0') {
					count += 6;
				} else if (numbers.charAt(i) == '8') {
					count += 7;
				}
			}
			System.out.println(String.format("%d leds", count));
		}
	}
}
