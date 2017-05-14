package exUri.beginner;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex1042 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] val = new int[3];
		int[] k = new int[3];
		for (int i = 0; i < 3; i++) {
			val[i] = scanner.nextInt();
			k[i] = val[i];
		}
		Arrays.sort(val);
		for (int i = 0; i < 3; i++) {
			System.out.println(val[i]);
		}
		System.out.println();
		for (int i = 0; i < val.length; i++) {
			System.out.println(k[i]);
		}
	}

}
