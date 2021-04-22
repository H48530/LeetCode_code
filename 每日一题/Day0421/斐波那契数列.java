package Day0421;

import java.util.*;

/**
 * 给你一个最小数n，需要多少步变成斐波那契数
 */
public class 斐波那契数列 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;
        int y = 1;
        for (int i = 0; i < n - 1; i++) {
            x = fib(i);
            y = fib(i + 1);
            if (x <= n && y >= n) {
                break;
            }
        }
        System.out.println(Integer.min(n - x, y - n));
    }

    private static int fib(int n) {
        if (n < 2) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}