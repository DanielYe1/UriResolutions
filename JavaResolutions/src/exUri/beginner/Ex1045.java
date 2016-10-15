package exUri.beginner;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1045 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] x = new double[3];
		x[0] = scanner.nextDouble();
		x[1] = scanner.nextDouble();
		x[2] = scanner.nextDouble();
		Arrays.sort(x);
		double A = x[2];
		double B = x[1];
		double C = x[0];
		if (Math.abs(B - C) < A && A < B + C && Math.abs(A - C) < B && B < A + C && Math.abs(A - B) < C && C < A + B) {
			if (Math.pow(A, 2) == Math.pow(B, 2) + Math.pow(C, 2)) {
				System.out.println("TRIANGULO RETANGULO");
			}
			if (Math.pow(A, 2) > Math.pow(B, 2) + Math.pow(C, 2)) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			if (Math.pow(A, 2) < Math.pow(B, 2) + Math.pow(C, 2)) {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			if (A == B && B == C) {
				System.out.println("TRIANGULO EQUILATERO");
			}
			if ((C == B || A == B) && !(A == B && B == C)) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		} else {
			System.out.println("NAO FORMA TRIANGULO");
		}

	}

}
