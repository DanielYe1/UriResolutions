package exUri.adHoc;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex1403 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		while (n != 0 && m != 0) {
			int x;
			TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					x = scanner.nextInt();
					if (map.containsKey(x)) {
						map.put(x, map.get(x) + 1);
					} else {
						map.put(x, 1);
					}
				}
			}
			int[] players = new int[n * m];
			int[] pontos = new int[n * m];
			int k = 0;
			for (Integer key : map.keySet()) {
				players[k] = key;
				pontos[k] = map.get(key);
				k += 1;
			}
			Arrays.sort(pontos);
			int desejado = pontos[pontos.length - 2];
			StringBuilder batata = new StringBuilder();
			for (Integer key : map.keySet()) {
				if (map.get(key) == desejado) {
					batata.append(key + " ");
				}
			}
			System.out.println(batata);
			n = scanner.nextInt();
			m = scanner.nextInt();
		}
	}
}
