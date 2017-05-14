package exUri.beginner;

import java.util.Scanner;

public class Ex1018 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = a / 100;
		int b1 = a % 100;
		int c = b1 / 50;
		int c1 = b1 % 50;
		int d = c1 / 20;
		int d1 = c1 % 20;
		int e = d1 / 10;
		int e1 = d1 % 10;
		int f = e1 / 5;
		int f1 = e1 % 5;
		int g = f1 / 2;
		int g1 = f1 % 2;
		int h = g1 / 1;
		int h1 = g1 % 1;
		System.out.println(a);
		System.out.println(String.format("%d nota(s) de R$ 100,00", (int) Math.floor(b)));
		System.out.println(String.format("%d nota(s) de R$ 50,00", (int) Math.floor(c)));
		System.out.println(String.format("%d nota(s) de R$ 20,00", (int) Math.floor(d)));
		System.out.println(String.format("%d nota(s) de R$ 10,00", (int) Math.floor(e)));
		System.out.println(String.format("%d nota(s) de R$ 5,00", (int) Math.floor(f)));
		System.out.println(String.format("%d nota(s) de R$ 2,00", (int) Math.floor(g)));
		System.out.println(String.format("%d nota(s) de R$ 1,00", (int) Math.floor(h)));
	}

}
