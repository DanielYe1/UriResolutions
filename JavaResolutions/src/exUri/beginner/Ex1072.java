package exUri.beginner;

import java.util.Scanner;

public class Ex1072 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		int in = 0;
		int out = 0;
		for (int i = 0; i < times; i++) {
			int k = scanner.nextInt();
			if (k >= 10 && k <= 20) {
				in++;
			} else {
				out++;
			}
		}
		System.out.println(String.format("%d in", in));
		System.out.println(String.format("%d out", out));
	}

}
