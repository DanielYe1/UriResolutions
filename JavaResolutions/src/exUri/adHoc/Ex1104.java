package exUri.adHoc;

import java.util.HashSet;
import java.util.Scanner;

public class Ex1104 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int timesP1 = scanner.nextInt();
		int timesP2 = scanner.nextInt();
		while (timesP1 != 0 && timesP2 != 0) {
			HashSet p1 = new HashSet();
			HashSet p2 = new HashSet();
			for (int i = 0; i < timesP1; i++) {
				p1.add(scanner.nextInt());
			}
			for (int i = 0; i < timesP2; i++) {
				p2.add(scanner.nextInt());
			}
			int tamP1 = p1.size();
			int tamP2 = p2.size();
			p1.retainAll(p2);
			int diff = p1.size();
			if (tamP1 < tamP2) {
				System.out.println(tamP1 - diff);
			} else {
				System.out.println(tamP2 - diff);
			}
			timesP1 = scanner.nextInt();
			timesP2 = scanner.nextInt();
		}
	}

}
