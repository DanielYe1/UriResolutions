package exUri.beginner;

import java.util.Scanner;

public class Ex1094 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		double[] animals = new double[3];
		for (int i = 0; i < times; i++) {
			double qt = scanner.nextDouble();
			String code = scanner.next();
			if (code.equals("C")) {
				animals[0] += qt;
			} else if (code.equals("R")) {
				animals[1] += qt;
			} else {
				animals[2] += qt;
			}
		}
		double total = animals[0] + animals[1] + animals[2];
		System.out.println(String.format("Total: %.0f cobaias", total));
		System.out.println(String.format("Total de coelhos: %.0f", animals[0]));
		System.out.println(String.format("Total de ratos: %.0f", animals[1]));
		System.out.println(String.format("Total de sapos: %.0f", animals[2]));
		System.out.println(String.format("Percentual de coelhos: %.2f ", (animals[0] / total) * 100) + "%");
		System.out.println(String.format("Percentual de ratos: %.2f ", (animals[1] / total) * 100) + "%");
		System.out.println(String.format("Percentual de sapos: %.2f ", (animals[2] / total) * 100) + "%");
	}

}
