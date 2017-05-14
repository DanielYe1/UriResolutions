package exUri.adHoc;

import java.util.Scanner;

public class Ex1091 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		while (times != 0) {
			int cordX = scanner.nextInt();
			int cordY = scanner.nextInt();
			int x = 0;
			int y = 0;
			for (int i = 0; i < times; i++) {
				x = scanner.nextInt();
				y = scanner.nextInt();
				if (x == cordX || y == cordY) {
					System.out.println("divisa");
				} else if (x > cordX) {
					if (y > cordY) {
						System.out.println("NE");
					} else {
						System.out.println("SE");
					}
				} else {
					if (y > cordY) {
						System.out.println("NO");
					} else {
						System.out.println("SO");
					}
				}
			}
			times = scanner.nextInt();
		}
	}
}
