package exUri.dataStructures;

import java.io.IOException;
import java.util.Scanner;

public class Ex1430 {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		while (!input.equals("*")) {
			String[] jingle = input.split("/");
			int jsize = jingle.length;
			int tot = 0;
			int count = 0;
			for (int i = 0; i < jsize; i++) {
				for (int j = 0; j < jingle[i].length(); j++) {
					switch (jingle[i].charAt(j)) {
					case 'W':
						count += 64;
						break;
					case 'H':
						count += 32;
						break;
					case 'Q':
						count += 16;
						break;
					case 'E':
						count += 8;
						break;
					case 'S':
						count += 4;
						break;
					case 'T':
						count += 2;
						break;
					case 'X':
						count += 1;
						break;
					}
				}
				if (count == 64) {
					tot++;
				}
				count = 0;
			}
			System.out.println(tot);
			input = scanner.next();
		}
	}
}
