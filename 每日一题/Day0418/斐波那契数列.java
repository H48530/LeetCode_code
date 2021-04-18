package Day0418;

import java.util.Scanner;
import java.util.Stack;

/**
 * 输出一个虽小步数变为斐波那契数
 */
public class 斐波那契数列 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        int n = 0;
        while (true) {
            if (Fib(n) < x) {
                stack.push(Fib(n));
            } else {
                stack.push(Fib(n));
                break;
            }
            n++;
        }
        int a = stack.pop() - x;
        int b = x - stack.pop();
        System.out.println(Integer.min(a, b));
    }

    private static int Fib(int n) {
        if (n <= 2) {
            return n;
        }
        return Fib(n - 1) + Fib(n - 2);
    }
}
