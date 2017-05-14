package exUri.strings;

import java.util.Scanner;

public class Ex1222 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int qtWords = scanner.nextInt();
			int lineLimit = scanner.nextInt();
			int charLimit = scanner.nextInt();
			int count = 0;
			int totalLines = 1;
			int totalPages = 1;
			String palavra;
			for (int i = 0; i < qtWords; i++) {
				palavra = scanner.next();
				if (count + palavra.length() <= charLimit) {
					count += palavra.length() + 1;
				} else {
					totalLines += 1;
					count = palavra.length() + 1;
					if (totalLines > lineLimit) {
						totalPages += 1;
						totalLines = 1;
					}
				}
			}
			System.out.println(totalPages);
		}
	}

}
