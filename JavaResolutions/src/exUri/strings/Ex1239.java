package exUri.strings;

import java.util.Scanner;

public class Ex1239 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String sentence = scanner.nextLine();
			boolean asterisco1 = true;
			boolean underline1 = true;
			for (int i = 0; i < sentence.length(); i++) {
				char val = sentence.charAt(i);
				if (val == '*') {
					if (asterisco1) {
						System.out.print("<b>");
						asterisco1 = false;
					} else {
						System.out.print("</b>");
						asterisco1 = true;
					}
				} else if (val == '_') {
					if (underline1) {
						System.out.print("<i>");
						underline1 = false;
					} else {
						System.out.print("</i>");
						underline1 = true;
					}
				} else {
					System.out.print(val);
				}
			}
			System.out.println();
		}
	}

}
