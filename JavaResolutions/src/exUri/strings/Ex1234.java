package exUri.strings;

import java.util.Scanner;

public class Ex1234 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String words = scanner.nextLine();
			String newone = "";
			int count = 0;
			for (int j = 0; j < words.length(); j++) {
				if (words.charAt(j) != ' ') {
					if (count % 2 == 0) {
						newone = newone + Character.toUpperCase(words.charAt(j));
					} else {
						newone = newone + Character.toLowerCase(words.charAt(j));
					}
					count++;
				} else {
					newone += ' ';
				}
			}
			System.out.println(newone);
		}
	}
}
