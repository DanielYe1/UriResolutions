package exUri.adHoc;

import java.util.Scanner;
import java.util.TreeMap;

public class Ex1171 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		TreeMap<Integer, Integer> map = new TreeMap();
		int num;
		for (int i = 0; i < times; i++) {
			num = scanner.nextInt();
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
		}
		for (int key : map.keySet()) {
			System.out.println(String.format("%d aparece %d vez(es)", key, map.get(key)));
		}
	}

}
