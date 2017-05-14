package exUri.strings;

import java.util.Scanner;

public class Ex1120 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String n = scanner.next();
		String num = scanner.next();
		while (!n.equals("0") && !num.equals("0")) {
			int k = num.length();
			String ans = "";
			boolean first = true;
			ans = num.replaceAll(n, "");
			k = ans.length();
			char valor;
			StringBuilder lol = new StringBuilder();
			for (int i = 0; i < k; i++) {
				valor = ans.charAt(i);
				if (valor != '0') {
					first = false;
				}
				if (!first) {
					lol.append(valor);
				}
			}
			if (lol.length() == 0) {
				System.out.println("0");
			} else {
				System.out.println(lol);
			}

			n = scanner.next();
			num = scanner.next();
		}
	}

}
