package exUri.sort;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Ex1244 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		for (int i = 0; i <= times; i++) {
			String word = scanner.nextLine();
			if (i == 0) {
				continue;
			}
			String[] words = word.split(" ");
			Arrays.sort(words, new Comparator<String>() {

				@Override
				public int compare(String s1, String s2) {
					if (s1.length() < s2.length()) {
						return 1;
					} else if (s1.length() > s2.length()) {
						return -1;
					} else {
						return 0;
					}
				}
			});
			int quantity = words.length;
			for (int j = 0; j < quantity; j++) {
				if (j != quantity - 1) {
					System.out.printf(words[j] + " ");
				} else {
					System.out.println(words[j]);
				}
			}
		}
	}

}
