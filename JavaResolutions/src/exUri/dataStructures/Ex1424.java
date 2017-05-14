package exUri.dataStructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex1424 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<Integer, ArrayList> map = new HashMap<>();
		while (scanner.hasNext()) {
			int size = scanner.nextInt();
			int moves = scanner.nextInt();
			int[] nums = new int[size];
			for (int i = 0; i < size; i++) {
				nums[i] = scanner.nextInt();
				if (map.get(nums[i]) != null) {
					map.get(nums[i]).add(i + 1);
				} else {
					ArrayList list = new ArrayList();
					list.add(i + 1);
					map.put(nums[i], list);
				}
			}
			for (int i = 0; i < moves; i++) {
				int times = scanner.nextInt();
				int number = scanner.nextInt();
				if (map.get(number) != null && map.get(number).size() >= times) {
					System.out.println(map.get(number).get(times - 1));
				} else {
					System.out.println(0);
				}
			}
			map.values().clear();
		}
	}
}
