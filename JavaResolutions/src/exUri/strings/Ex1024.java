package exUri.strings;

import java.util.Scanner;

public class Ex1024 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		for (int j = 0; j <= times; j++) {
			String words = scanner.nextLine();
			if (j == 0) {
				continue;
			}
			String newone = "";
			String newtwo = "";
			String newthree = "";
			for (int i = 0; i < words.length(); i++) {
				if (Character.isLetter(words.charAt(i))) {
					newone += (char) (words.charAt(i) + 3);
				} else {
					newone += words.charAt(i);
				}
			}
			int space = newone.length() - 1;
			for (int i = space; i >= 0; i--) {
				newtwo += newone.charAt(i);
			}
			int newspace = (space + 1) / 2;
			for (int i = 0; i <= space; i++) {
				if (i < newspace) {
					newthree += newtwo.charAt(i);
				} else {
					newthree += (char) (newtwo.charAt(i) - 1);
				}
			}
			System.out.println(newthree);
		}
	}
}
