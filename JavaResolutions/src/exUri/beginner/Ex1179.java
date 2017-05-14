package exUri.beginner;

import java.util.Scanner;

public class Ex1179 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] odd = new int[5];
		int[] even = new int[5];
		int oddIndex = 0;
		int evenIndex = 0;
		for (int i = 0; i < 15; i++) {
			int num = scanner.nextInt();
			if (num % 2 == 0) {
				even[evenIndex] = num;
				evenIndex++;
				if (evenIndex == 5) {
					evenIndex = 0;
					for (int j = 0; j < 5; j++) {
						System.out.println(String.format("par[%d] = %d", j, even[j]));
					}
					even = new int[5];
				}
			} else {
				odd[oddIndex] = num;
				oddIndex++;
				if (oddIndex == 5) {
					oddIndex = 0;
					for (int j = 0; j < 5; j++) {
						System.out.println(String.format("impar[%d] = %d", j, odd[j]));
					}
					odd = new int[5];
				}
			}
		}
		for (int i = 0; i < oddIndex; i++) {
			System.out.println(String.format("impar[%d] = %d", i, odd[i]));
		}
		for (int i = 0; i < evenIndex; i++) {
			System.out.println(String.format("par[%d] = %d", i, even[i]));
		}
	}

}
