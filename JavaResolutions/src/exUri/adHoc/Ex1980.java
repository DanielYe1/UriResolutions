package exUri.adHoc;

import java.util.Scanner;

public class Ex1980 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.next();
		while (!text.equals("0")) {
			float count = 1;
			int times = text.length();
			for (int i = 1; i <= times; i++) {
				count *= i;
			}
			System.out.println(count);
			text = scanner.next();
		}
	}

}
