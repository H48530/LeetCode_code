package Day0526;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 递推公式 F(n)= F(n-1)+F(n-2)；
 */
public class 养兔子 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            long ret = func(n);
            System.out.println(ret);
        }
    }

    private static long func(int n) {
        if (n <= 2) {
            return n;
        }
        int f = 1;
        int s = 2;

        for (int i = 3; i <= n; i++) {
            int t = f + s;
            f = s;
            s = t;
        }
        return s;
    }
}
