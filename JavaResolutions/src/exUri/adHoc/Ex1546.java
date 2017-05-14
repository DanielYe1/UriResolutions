package exUri.adHoc;

import java.util.HashMap;
import java.util.Scanner;

public class Ex1546 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap map = new HashMap();
		map.put(1, "Rolien");
		map.put(2, "Naej");
		map.put(3, "Elehcim");
		map.put(4, "Odranoel");
		int times = scanner.nextInt();
		for (int i = 0; i < times; i++) {
			int moves = scanner.nextInt();
			for (int j = 0; j < moves; j++) {
				int pessoa = scanner.nextInt();
				System.out.println(map.get(pessoa));
			}
		}
	}

}
