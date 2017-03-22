package exUri.adHoc;

import java.util.Scanner;

/**
 * Created by daniel on 1/3/17.
 */
public class Ex1407 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        int qt = scanner.nextInt();
        int max = scanner.nextInt();

        while (times != 0 && qt != 0 && max != 0) {
            int[] values = new int[max];
            int total = times * qt;
            for (int i = 0; i < total; i++) {
                values[scanner.nextInt() - 1]++;
            }
            int lowest = values[0];
            for (int i = 1; i < max; i++) {
                if (lowest > values[i]) {
                    lowest = values[i];
                }
            }
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < max; i++) {
                if (lowest == values[i]) {
                    ans.append(String.format("%d ", i + 1));
                }
            }
            ans.deleteCharAt(ans.length() - 1);
            System.out.println(ans);
            times = scanner.nextInt();
            qt = scanner.nextInt();
            max = scanner.nextInt();
        }
    }
}
