package exUri.math;

import java.util.Scanner;

public class Ex1232 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] frente = new int[8];
		int[] direita = new int[8];
		int[] esquerda = new int[8];
		int[] atras = new int[8];
		int[] baixo = new int[8];
		int[] cima = new int[8];
		for (int i = 0; i < 8; i++) {
			frente[i] = 0;
			direita[i] = 1;
			esquerda[i] = 2;
			atras[i] = 3;
			baixo[i] = 4;
			cima[i] = 5;
		}
		String moves = scanner.next();
		char move;
		for (int i = 0; i < moves.length(); i++) {
			move = moves.charAt(i);
			switch (move) {
			case 'R':
				ladoCerto(direita,2);
				System.out.println(direita[0]);
				break;

			default:
				break;
			}
		}

	}

	static void ladoCerto(int[] nums, int n) {
		//direita,frente,
		int aux = nums[0];
		int aux2 = nums[1];
		for (int i = 0; i < 6; i++) {
			nums[i+2] = nums[i];
		}
		nums[0] = aux;
		nums[1] = aux2;
	}

}
