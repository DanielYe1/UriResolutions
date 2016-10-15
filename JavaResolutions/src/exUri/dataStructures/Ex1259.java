package exUri.dataStructures;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1259 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		Arrays.sort(array);
		for (int i = 0; i < size; i++) {
			if (array[i] % 2 == 0) {
				System.out.println(array[i]);
			}
		}
		for (int i = 0; i < size; i++) {
			if (array[size - 1 - i] % 2 == 1) {
				System.out.println(array[size - 1 - i]);
			}
		}
	}

}
