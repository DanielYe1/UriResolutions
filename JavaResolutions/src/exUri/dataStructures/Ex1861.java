package exUri.dataStructures;

import java.util.Scanner;
import java.util.TreeMap;

public class Ex1861 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		String[] died = new String[100000];
		int ind = 0;
		while (scanner.hasNext()) {
			String name1 = scanner.next();
			String name2 = scanner.next();
			died[ind] = name2;
			if (map.get(name1) == null) {
				map.put(name1, 1);
			} else {
				map.put(name1, map.get(name1) + 1);
			}
			ind++;
		}
		for (int i = 0; i < died.length; i++) {
			if (died[i] == null) {
				break;
			}
			if (map.containsKey(died[i])) {
				map.remove(died[i]);
			}
		}
		System.out.println("HALL OF MURDERERS");
		for (String key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}

	}
}
