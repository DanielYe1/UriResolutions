package exUri.strings;

import java.util.Scanner;

public class Ex1871 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		while (x != 0 && y != 0) {
			int z = x + y;
			String total = Integer.toString(z).replaceAll("0", "");
			System.out.println(total);
			x = scanner.nextInt();
			y = scanner.nextInt();
		}
	}

}
