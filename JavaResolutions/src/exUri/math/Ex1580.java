package exUri.math;

import java.math.BigInteger;
import java.util.Scanner;

public class Ex1580 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.next();
		int[] quantity = new int[26];
		for (int i = 0; i < text.length(); i++) {
			quantity[text.charAt(i) - 65] += 1;
		}
		String number = Integer.toString(text.length());
		BigInteger prod = new BigInteger("1");
		BigInteger max = new BigInteger("1000000009");
		while (!number.equals("0")) {
			for (int i = Integer.valueOf(number); i > 0; i--) {
				prod = prod.multiply(new BigInteger(Integer.toString(i)));
				prod = prod.mod(new BigInteger("1000000009"));
			}
			System.out.println(prod);
			number = scanner.next();
			prod = new BigInteger("1");
		}
	}

}
