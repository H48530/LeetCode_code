package Day0524;

import java.util.Scanner;

/**
 *
 */
public class 菲波那切凤尾 {
    static int[] fib = new int[100001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            fib[0] = 1;
            fib[1] = 1;
            for (int i = 2; i < 100001; i++) {
                fib[i] = (fib[i - 1] + fib[i - 2]) % 1000000;
            }
            System.out.println(fib[n]);
        }
    }
}