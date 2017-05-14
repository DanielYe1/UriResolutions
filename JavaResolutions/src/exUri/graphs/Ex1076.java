package exUri.graphs;

import java.util.Scanner;

public class Ex1076 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int qtMoves;
		int start;
		int count = 0;
		int times = scanner.nextInt();
		for (int i = 0; i < times; i++) {
			start = scanner.nextInt();
			int size = scanner.nextInt();
			qtMoves = scanner.nextInt();
			boolean[][] graph = new boolean[size][size];
			for (int j = 0; j < qtMoves; j++) {
				int move1 = scanner.nextInt();
				int move2 = scanner.nextInt();
				if (!graph[move1][move2] && !graph[move2][move1]) {
					graph[move1][move2] = true;
					graph[move2][move1] = true;
					count++;
				}
			}
			System.out.println(count * 2);
			count = 0;
		}
	}
}
