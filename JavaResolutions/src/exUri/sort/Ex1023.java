package exUri.sort;

import java.util.Scanner;

public class Ex1023 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		int count = 0;
		float people = 0;
		float water = 0;
		float media = 0;
		float mediaTotal = 0;
		while (times != 0) {
			media = 0;
			mediaTotal = 0;
			int[] waterPerPeople = new int[201];
			for (int i = 0; i < times; i++) {
				people = scanner.nextFloat();
				water = scanner.nextFloat();
				media = water / people;
				mediaTotal += media;
				waterPerPeople[(int) media] += people;
			}
			System.out.println(String.format("Cidade# %d:", ++count));
			StringBuilder cases = new StringBuilder();
			for (int i = 0; i <= 200; i++) {
				if (waterPerPeople[i] != 0) {
					cases.append(String.format("%d-%d ", waterPerPeople[i], i));
				}
			}
			cases.deleteCharAt(cases.length() - 1);
			System.out.println(cases);
			System.out.println(String.format("Consumo medio: %.2f m3.", mediaTotal));

			System.out.println();

			times = scanner.nextInt();
		}
	}
}
