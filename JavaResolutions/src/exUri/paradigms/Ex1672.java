package exUri.paradigms;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1672 {

	public static int execute(int n, int k) {
		int killIdx = 0;
		ArrayList<Integer> prisoners = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			prisoners.add(i);
		}
		while (prisoners.size() > 1) {
			killIdx = (killIdx + k - 1) % prisoners.size();
			prisoners.remove(killIdx);
		}
		return prisoners.get(0) + 1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String num = scanner.next();
		char x, y, z;
		String teste = "";
		double numero = 0;
		String qtZeros = "";
		while (!num.equals("00e0")) {
			x = num.charAt(0);
			y = num.charAt(1);
			z = num.charAt(3);
			teste = "" + x + y;
			qtZeros = "" + z;
			numero = Integer.parseInt(teste) * Math.pow(10, Integer.parseInt(qtZeros));
			System.out.println(execute((int) numero, 2));
			num = scanner.next();
		}
	}

}
