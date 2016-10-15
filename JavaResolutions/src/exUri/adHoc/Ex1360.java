package exUri.adHoc;

import java.util.Scanner;

public class Ex1360 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		for (int o = 0; o < times; o++) {
			String[] cartas = new String[4];
			int[] values = new int[4];
			for (int i = 0; i < 4; i++) {
				cartas[i] = scanner.next();
			}
			for (int i = 0; i < cartas.length; i++) {
				switch (cartas[i].charAt(1)) {
				case 'H':
					values[i] = 100;
					break;
				case 'C':
					values[i] = 200;
					break;
				case 'D':
					values[i] = 300;
					break;
				case 'S':
					values[i] = 400;
					break;
				}
				switch (cartas[i].charAt(0)) {
				case 'T':
					values[i] += 10;
					break;
				case 'J':
					values[i] += 11;
					break;
				case 'Q':
					values[i] += 12;
					break;
				case 'K':
					values[i] += 13;
					break;
				default:
					values[i] += Integer.parseInt(cartas[i].charAt(0) + "");
				}
			}

			int soma = 0;
			if (values[1] < values[2] && values[1] < values[3]) {
				if (values[2] < values[3]) {
					soma = 1;
				} else {
					soma = 2;
				}
			} else if (values[1] > values[2] && values[1] < values[3]) {
				soma = 3;
			} else if (values[1] < values[2] && values[1] > values[3]) {
				soma = 4;
			} else if (values[1] > values[2] && values[1] > values[3]) {
				if (values[2] < values[3]) {
					soma = 5;
				} else {
					soma = 6;
				}
			}
			char initFinal = cartas[0].charAt(0);
			char naipeFinal = cartas[0].charAt(1);
			Integer valor = 0;
			switch (initFinal) {
			case 'T':
				valor = 10;
				break;
			case 'J':
				valor += 11;
				break;
			case 'Q':
				valor += 12;
				break;
			case 'K':
				valor += 13;
				break;
			default:
				valor += Integer.parseInt(initFinal + "");
			}
			valor += soma;
			if (valor > 13) {
				valor -= 13;
			}
			switch (valor) {
			case 10:
				System.out.println("T" + naipeFinal);
				break;
			case 11:
				System.out.println("J" + naipeFinal);
				break;
			case 12:
				System.out.println("Q" + naipeFinal);
				break;
			case 13:
				System.out.println("K" + naipeFinal);
				break;
			default:
				System.out.println(String.format("%d" + naipeFinal, valor));
			}
		}
	}

}
