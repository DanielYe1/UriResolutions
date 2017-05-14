package exUri.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1303 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int games;
		int player1;
		int player2;
		int score1;
		int score2;
		int instances = 0;
		while (n != 0) {
			Player[] players = new Player[n];
			for (int i = 0; i < n; i++) {
				players[i] = new Player(i + 1);
			}
			games = n * (n - 1) / 2;

			for (int i = 0; i < games; i++) {
				player1 = scanner.nextInt();
				score1 = scanner.nextInt();
				player2 = scanner.nextInt();
				score2 = scanner.nextInt();

				players[player1 - 1].addScore(score1);
				players[player1 - 1].addFails(score2);
				players[player2 - 1].addScore(score2);
				players[player2 - 1].addFails(score1);

				if (score1 > score2) {
					players[player1 - 1].wins += 2;
					players[player2 - 1].wins++;
				} else {
					players[player2 - 1].wins += 2;
					players[player1 - 1].wins++;
				}
			}

			Arrays.sort(players);
			StringBuilder builder = new StringBuilder("Instancia ");
			builder.append(++instances);
			builder.append("\n");
			for (Player player : players) {
				builder.append(player.index + " ");
			}
			builder.deleteCharAt(builder.length() - 1);
			System.out.println(builder);
			n = scanner.nextInt();
			if (n != 0) {
				System.out.println();
			}
		}
	}

	public static class Player implements Comparable<Player> {
		static final float DELTA = 0.0001f;
		int index;
		int wins;
		int score;
		int fails;

		public float getAverage() {
			if (fails == 0) {
				return score;
			} else {
				return (float) score / (float) fails;
			}
		}

		public Player(int index) {
			this.index = index;
		}

		public void win() {
			wins++;
		}

		public void addScore(int score) {
			this.score += score;
		}

		public void addFails(int fails) {
			this.fails += fails;
		}

		@Override
		public int compareTo(Player player) {
			if (wins == player.wins) {
				if (getAverage() == player.getAverage()) {
					if (Math.abs(score - player.score) < DELTA) {
						return index - player.index;
					} else {
						return player.score - score;
					}
				} else {
					return Float.compare(player.getAverage(), getAverage());
				}
			} else {
				return player.wins - wins;
			}
		}

	}
}
