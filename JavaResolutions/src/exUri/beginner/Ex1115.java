package exUri.beginner;

import java.util.Scanner;

public class Ex1115 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0.0 && y > 0.0) {
				System.out.println("primeiro");
			} else if (x < 0.0 && y > 0.0) {
				System.out.println("segundo");
			} else if (x < 0.0 && y < 0.0) {
				System.out.println("terceiro");
			} else if (x > 0.0 && y < 0.0) {
				System.out.println("quarto");
			}
			x = scanner.nextInt();
			y = scanner.nextInt();
		}
	}

}
