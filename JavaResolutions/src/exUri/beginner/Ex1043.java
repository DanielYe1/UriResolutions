package exUri.beginner;

import java.util.Scanner;

public class Ex1043 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		if (Math.abs(b - c) < a && a < b + c && Math.abs(a - c) < b && b < a + c && Math.abs(a - b) < c && c < a + b) {
			System.out.println(String.format("Perimetro = %.1f", a + b + c));
		} else {
			System.out.println(String.format("Area = %.1f", (a + b) * c / 2));
		}
	}

}