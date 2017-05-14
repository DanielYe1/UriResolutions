package exUri.dataStructures;

import java.util.Scanner;

public class Ex1162 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		int size;
		int count = 0;
		int aux = 0;
		for (int i = 0; i < times; i++) {
			size = scanner.nextInt();
			int[] order = new int[size];
			for (int j = 0; j < size; j++) {
				order[j] = scanner.nextInt();
			}
			for (int k = 0; k < size; k++) {
				for (int j = 0; j < size - 1; j++) {
					if (order[j] > order[j + 1]) {
						aux = order[j];
						order[j] = order[j + 1];
						order[j + 1] = aux;
						count++;
					}
				}
			}
			System.out.println(String.format("Optimal train swapping takes %d swaps.", count));
			count = 0;
		}
	}

}
