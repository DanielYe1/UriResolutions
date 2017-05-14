package exUri.paradigms;

import java.util.Scanner;

public class Ex1310 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int totalDays = scanner.nextInt();
			int cost = scanner.nextInt();
			int s = 0;
			int t = 0;
			int x = 0;
			for (int i = 0; i < totalDays; i++) {
				x = scanner.nextInt()-cost;
				t += x;
				if (t > s) {
					s = t;
				}
				if (t < 0) {
					t = 0;
				}
			}
			System.out.println(s);
		}
	}
}