package exUri.beginner;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1071 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] n = new int[2];
		n[0] = scanner.nextInt();
		n[1] = scanner.nextInt();
		Arrays.sort(n);
		int sum = 0;
		for (int i = n[0] + 1; i < n[1]; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
