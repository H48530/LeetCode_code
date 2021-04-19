package Day0419;

import java.util.*;

/**
 *
 */
public class 删数 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 1000) {
            a = 1000;
        }
        else if (a <= 1) {
            System.out.println(a);
            return;
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < a; i++) {
            queue.add(i);
        }
        while (queue.size() != 1) {
            int m = queue.remove();
            queue.add(m);
            int n = queue.remove();
            queue.add(n);
            queue.remove();
        }
        System.out.println(queue.remove());
    }
}

