package Day0527;

import java.util.Scanner;

/**
 *
 */
public class 年会抽奖 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n == 1) {
                System.out.println("0.00%");
                continue;
            }
            double ret = Math.pow(0.5, n - 1);
            System.out.printf("%.2f", ret * 100);
            System.out.println("%");
        }
    }
}
