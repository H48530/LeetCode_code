package Day0509;

import java.util.Scanner;

/**
 *
 */
public class 喝汽水 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            if (a == 0) {
                return;
            }
            int ret = func(a);
            System.out.println(ret);
        }
    }

    private static int func(int n) {
        if (n == 2) {
            return 1;
        }
        if (n < 2) {
            return 0;
        }
        int sum = n/3;
        sum += func(n % 3 + n / 3);
        return sum;
    }
}
