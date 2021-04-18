package Day0418;

import java.util.*;

/**
 *
 */
public class 求最小公倍数 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        int ret = func(x, n);
        System.out.println(ret);
    }

    private static int func(int x, int y) {
        int m = x;
        int n = y;
        int a = 1;

        while (a != 0) {
            a = m % n;
            m = n;
            n = a;
        }
        return (x / m) * (y / m) * m;
    }
}