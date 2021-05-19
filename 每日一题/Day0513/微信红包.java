package Day0513;

import java.util.*;

/**
 *
 */
class Gift {
    public int getValue(int[] gifts, int n) {
        // write code here
        Map<Integer, Integer> map = new HashMap<>();
        for (int gift : gifts) {
            int size = map.getOrDefault(gift, 0);
            map.put(gift, size + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int a = entry.getValue();
            int b = entry.getKey();
            if (a >= n / 2) {
                return b;
            }
        }
        return 0;
    }
}

public class 微信红包 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 2};
        int n = 5;
        Gift a = new Gift();
        System.out.println(a.getValue(arr, n));
    }
}
