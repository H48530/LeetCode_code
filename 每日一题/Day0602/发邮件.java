package m6;

import java.math.BigInteger;
import java.util.*;

/**
 * f(n) = (n-1)*(f(n-2)+f(n-1))
 */
public class 发邮件 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            System.out.println(count(n));
        }
    }

    private static long count(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return (n - 1) * (count(n - 1) + count(n - 2));
        }
    }
}
