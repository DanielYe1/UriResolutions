package exUri.dataStructures;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex1251 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean printa = false;
		while (scanner.hasNext()) {
			if (printa) {
				System.out.println();
			} else {
				printa = true;
			}
			String word = scanner.next();
			int[] ascii = new int[130];
			int[] qtVezes = new int[1001];
			TreeMap<Integer, LinkedList> times = new TreeMap<Integer, LinkedList>();
			for (int i = 0; i < word.length(); i++) {
				ascii[word.charAt(i)] += 1;
			}

			for (int i = 0; i < 130; i++) {
				if (!times.containsKey(ascii[i])) {
					LinkedList<Integer> test = new LinkedList<Integer>();
					test.add(i);
					times.put(ascii[i], test);
				} else {
					times.get(ascii[i]).add(i);
				}
			}

			for (int key : times.keySet()) {
				if (key == 0) {
					continue;
				}
				Collections.sort(times.get(key), Collections.reverseOrder());
				for (int i = 0; i < times.get(key).size(); i++) {
					System.out.println(String.format("%d %d", times.get(key).get(i), key));
				}
			}
		}
	}

}
