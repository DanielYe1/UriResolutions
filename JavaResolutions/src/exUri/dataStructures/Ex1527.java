package exUri.dataStructures;

import java.io.BufferedInputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ex1527 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedInputStream(System.in));
		int qtPlayers = scanner.nextInt();
		int qtMoves = scanner.nextInt();
		while (qtMoves != 0 && qtPlayers != 0) {
			int countwins = 0;
			Player[] players = new Player[qtPlayers + 1];
			for (int i = 1; i <= qtPlayers; i++) {
				int att = scanner.nextInt();
				players[i] = new Player(i, att);
			}

			for (int i = 0; i < qtMoves; i++) {
				int choice = scanner.nextInt();
				int team1 = scanner.nextInt();
				int team2 = scanner.nextInt();
				if (choice == 1) {
					join(players, team1, team2);
				} else {
					if (players[team1].attack > players[team2].attack) {
						if (players[team1].guilds.iterator().next().equals(1)) {
							countwins++;
						}
					} else {
						if (players[team2].guilds.iterator().next().equals(1)) {
							countwins++;
						}
					}
				}
			}
			System.out.println(countwins);
			qtMoves = scanner.nextInt();
			qtPlayers = scanner.nextInt();
		}
	}

	public static void join(Player[] players, int player1Index, int player2Index) {
		Player player1 = players[player1Index];
		Player player2 = players[player2Index];

		// Calculado o valor de attack e os integrantes da guild
		player1.attack += player2.attack;
		player1.guilds.addAll(player2.guilds);

		// Atualizando os valores
		Iterator<Integer> interator = player1.guilds.iterator();
		int index;
		while (interator.hasNext()) {
			index = interator.next();
			players[index].guilds = player1.guilds;
			players[index].attack = player1.attack;
		}
	}

	public static class Player {
		int id;
		int attack;
		HashSet<Integer> guilds;

		public Player(int id, int attack) {
			this.id = id;
			this.attack = attack;
			guilds = new HashSet<Integer>();
			guilds.add(id);
		}
	}
}
