package exUri.beginner;

import java.util.Scanner;

public class Ex1047 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int h1 = scanner.nextInt();
		int m1 = scanner.nextInt();
		int h2 = scanner.nextInt();
		int m2 = scanner.nextInt();

		int min = 0;
		int h = 0;
		if (m1 < m2) {
			min = m2 - m1;
		} else if (m1 == m2) {
			min = 0;
		} else if (m1 > m2) {
			min = 60 - m1 + m2;
			h = -1;
		}
		if (h1 > h2) {
			h += 24 - h1 + h2;
		} else if (h1 == h2) {
			h += 24;
		} else if (h1 < h2) {
			h += h2 - h1;
		}
		System.out.println(String.format("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", h, min));

	}

}
