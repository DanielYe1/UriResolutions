package exUri.beginner;

import java.util.HashMap;
import java.util.Scanner;

public class Ex1134 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int[] fuel = new int[3];
		while (x != 4) {
			if (x > 0 && x < 4) {
				fuel[x - 1] += 1;
			}
			x = scanner.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println(String.format("Alcool: %d", fuel[0]));
		System.out.println(String.format("Gasolina: %d", fuel[1]));
		System.out.println(String.format("Diesel: %d", fuel[2]));
	}

}
