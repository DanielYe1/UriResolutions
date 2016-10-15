package exUri.dataStructures;

import java.util.Scanner;

public class Ex1023 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		int count = 0;
		int people = 0;
		int water = 0;
		int media = 0;
		float totWater = 0;
		float totPeople = 0;
		while (times != 0) {
			totWater = 0;
			totPeople = 0;

			int[] waterPerPeople = new int[201];
			for (int i = 0; i < times; i++) {
				people = scanner.nextInt();
				water = scanner.nextInt();
				media = water / people;
				totWater += water;
				totPeople += people;
				waterPerPeople[media] += people;
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
			System.out.println(String.format("Consumo medio: %.2f m3.", (totWater / totPeople) - 0.0049999));
			System.out.println();

			times = scanner.nextInt();
		}
	}
}
