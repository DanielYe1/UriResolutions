package exUri.adHoc;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1030 {
	
    public static int execute(int n, int k) {
        int killIdx = 0;
        ArrayList<Integer> prisoners = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) {
            prisoners.add(i);
        }
        while (prisoners.size() > 1) {
            killIdx = (killIdx + k - 1) % prisoners.size();
            prisoners.remove(killIdx);
        }
        return prisoners.get(0) + 1;
    }

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        for (int i = 0; i < times; i++) {
            int people = scanner.nextInt();
            int loop = scanner.nextInt();
            System.out.println(String.format("Case %d: %d", i + 1, execute(people, loop)));
        }
	}

}
