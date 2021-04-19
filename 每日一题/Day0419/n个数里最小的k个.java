package Day0419;

import java.util.*;

/**
 *
 */
public class n个数里最小的k个 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (sc.hasNextInt()) {
            int s = sc.nextInt();
            list.add(s);
        }
        int k = list.remove(list.size() - 1);
        Collections.sort(list);
        for (int i = 0; i < k; i++) {
            System.out.printf("%d ",list.remove(0));
        }
    }
}
