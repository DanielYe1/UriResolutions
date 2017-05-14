package exUri.strings;

import java.util.Scanner;

public class Ex1551 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] letras = new char[26];
		int times = scanner.nextInt();
		for (int j = 0; j <= times; j++) {
			String words = scanner.nextLine();
			if (j == 0) {
				continue;
			}
			int k = 0;
			int count = 0;
			for (int i = 0; i < 26; i++) {
				letras[i] = (char) (97 + i);
			}
			for (int i = 0; i < words.length(); i++) {
				if (Character.isLetter(words.charAt(i))) {
					k = words.charAt(i) - 97;
					letras[k] = '1';
				}
			}
			for (int i = 0; i < 26; i++) {
				if (letras[i] == '1') {
					count++;
				}
			}
			if (count == 26) {
				System.out.println("frase completa");
			} else if (count > 13) {
				System.out.println("frase quase completa");
			} else {
				System.out.println("frase mal elaborada");
			}

		}
	}
}
