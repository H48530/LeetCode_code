package Day0429;

import java.util.Scanner;

/**
 *
 */
public class iNOC产品部_完全数计算 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int count = count(a);
            System.out.println(count);
        }
    }

    private static int count(int n) {
        if (n <= 0 || n > 5000) {
            return -1;
        }
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isNumber(i)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isNumber(int a) {
        int count = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                count += i;
            }
        }
        return count == a;
    }
}
