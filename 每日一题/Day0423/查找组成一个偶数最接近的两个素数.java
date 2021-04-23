package Day0423;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 */
public class 查找组成一个偶数最接近的两个素数 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int a = sc.nextInt();

            for (int i = 2; i <= a / 2; i++) {
                if (contains(i)) {
                    stack.add(i);
                }
            }
            int m = 0;
            int n = 0;
            while (!stack.isEmpty()) {
                m = stack.pop();
                n = a - m;
                if (contains(n)) {
                    break;
                }
            }
            System.out.println(m);
            System.out.println(n);
        }
    }

    private static boolean contains(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
