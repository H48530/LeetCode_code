package m6.Day0610;

import java.util.*;

/**
 *
 */
public class 数组中出现次数超过一半的数字 {

    public int MoreThanHalfNum_Solution(int[] array) {
        int size = array.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : array) {
            int m = map.getOrDefault(i, 0);
            map.put(i, m + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int ret = entry.getValue();
            if (ret>size/2){
                return key;
            }
        }
        return 0;
    }

    public int MoreThanHalfNum_Solution2(int[] array) {
        Arrays.sort(array);
        int size = array.length / 2;
        int n = array[size];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                count++;
            }
        }
        if (count < size) {
            return 0;
        } else {
            return n;
        }
    }
}
