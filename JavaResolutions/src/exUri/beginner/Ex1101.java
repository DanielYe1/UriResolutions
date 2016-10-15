package exUri.beginner;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1101 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] val = new int[2];
		val[0] = scanner.nextInt();
		val[1] = scanner.nextInt();
		Arrays.sort(val);
		while (val[0] > 0 && val[1] > 0) {
			int k = 0;
			for (int i = val[0]; i <= val[1]; i++) {
				System.out.print(i + " ");
				k += i;
			}
			System.out.println(String.format("Sum=%d", k));
			val[0] = scanner.nextInt();
			val[1] = scanner.nextInt();
			Arrays.sort(val);
		}
	}

}
