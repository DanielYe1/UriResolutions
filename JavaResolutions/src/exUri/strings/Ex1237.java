package exUri.strings;

import java.util.Scanner;

public class Ex1237 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String word1 = scanner.nextLine();
			String word2 = scanner.nextLine();
			int count = 0;
			int higher = 0;
			int size1 = word1.length();
			int size2 = word2.length();
			for (int i = 0; i < size1; i++) {
				for (int j = 0; j < size2; j++) {
					if (word1.charAt(i) == word2.charAt(j)) {
						int indI = i;
						while (word1.charAt(indI) == word2.charAt(j)) {
							count++;
							indI++;
							j++;
							if (indI == size1 || j == size2) {
								indI -= 1;
								j -= 1;
								break;
							}
						}
						if (count > higher) {
							higher = count;
						}
						count = 0;
					}
				}
			}
			System.out.println(higher);
		}
	}
}
