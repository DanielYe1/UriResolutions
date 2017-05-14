package exUri.math;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class Ex1722 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(new BufferedInputStream(System.in));
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		while (n1 != 0 && n2 != 0) {
			double fibN1 = (Math.pow((1 + Math.sqrt(5)) / 2, n1) - Math.pow((1 - Math.sqrt(5)) / 2, n1)) / Math.sqrt(5);
			double fibN2 = (Math.pow((1 + Math.sqrt(5)) / 2, n2) - Math.pow((1 - Math.sqrt(5)) / 2, n2)) / Math.sqrt(5);
			System.out.println(fibN1);
			System.out.println(fibN2);
			n1 = scanner.nextInt();
			n2 = scanner.nextInt();
		
		}

	}

}
