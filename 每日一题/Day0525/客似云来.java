package Day0525;

import java.util.*;

/**
 *
 */
public class 客似云来 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int from = sc.nextInt();
            int to = sc.nextInt();

            System.out.println(fibSum(to) - fibSum(from - 1));
        }

    }

    private static long fibSum(int n) {
        if (n <= 2) {
            return n;
        }
        long sum = 2;
        int f = 1;
        int s = 1;
        int t = 0;
        for (int i = 3; i <= n; i++) {
            t = f + s;
            f = s;
            s = t;
            sum += t;
        }
        return sum;
    }
}