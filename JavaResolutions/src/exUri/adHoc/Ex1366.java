package exUri.adHoc;

import java.util.Scanner;

/**
 * Created by daniel on 1/3/17.
 */
public class Ex1366 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        while (times != 0) {
            int k;
            int total = 0;
            for (int i = 0; i < times; i++) {
                scanner.nextInt();
                k = scanner.nextInt();
                if (k % 2 == 0) {
                    total += k;
                } else {
                    total += k - 1;
                }
            }
            System.out.println(total / 4);
            times = scanner.nextInt();
        }
    }
}
