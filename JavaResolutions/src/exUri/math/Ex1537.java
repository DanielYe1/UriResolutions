package exUri.math;

import java.math.BigInteger;
import java.util.Scanner;

public class Ex1537 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String number = scanner.next();
		BigInteger prod = new BigInteger("1");
		BigInteger max = new BigInteger("1000000009");
		while (!number.equals("0")) {
			for (int i = Integer.valueOf(number); i > 3; i--) {
				prod = prod.multiply(new BigInteger(Integer.toString(i)));
				prod = prod.mod(new BigInteger("1000000009"));
			}
			System.out.println(prod);
			number = scanner.next();
			prod = new BigInteger("1");
		}
	}

}
