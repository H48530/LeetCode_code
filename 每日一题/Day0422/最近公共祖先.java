package Day0422;

import java.util.Stack;

/**
 *
 */
public class 最近公共祖先 {
    public static int getLCA(int a, int b) {
        // write code here
        Stack<Integer> stack1 = found(a);
        Stack<Integer> stack2 = found(b);
        int flag = 0;
        while (!stack1.isEmpty() && !stack2.isEmpty()) {
            int x = stack1.pop();
            int y = stack2.pop();
            if (x == y) {
                flag = x;
                continue;
            }
            return flag;
        }
        return flag;
    }

    private static Stack<Integer> found(int a) {
        Stack<Integer> stack = new Stack<>();
        while (a > 0) {
            stack.add(a);
            a >>= 1;
        }
        return stack;
    }

    public static void main(String[] args) {
        System.out.println(getLCA(2, 5));
    }
}
