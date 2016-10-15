package exUri.beginner;

import java.util.Scanner;

public class Ex1080 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int temp = 0;
		int index = 0;
		for (int i = 0; i < 100; i++) {
			int k = scanner.nextInt();
			if (k > temp) {
				temp = k;
				index = i + 1;
			}
		}
		System.out.println(temp);
		System.out.println(index);
	}

}
