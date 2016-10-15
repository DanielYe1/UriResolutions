package exUri.strings;

import java.util.Scanner;

public class Ex1367 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		while (times != 0) {
			int[] late = new int[26];
			int accept = 0;
			int totalTime = 0;
			for (int i = 0; i < times; i++) {
				int question = scanner.next().charAt(0) - 65;
				int time = scanner.nextInt();
				String ans = scanner.next();
				if (ans.equals("incorrect")) {
					late[question] += 20;
				} else if (ans.equals("correct")) {
					totalTime += late[question] + time;
					accept++;
				}
			}
			System.out.println(String.format("%d %d", accept, totalTime));
			times = scanner.nextInt();
		}
	}
}
