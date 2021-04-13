package Day0413;

import java.util.*;

/**
 *将数组排序，因为要超过半数，所以一定会在中间，所以，计算中间那个数出现次数，和数组长度在比较
 */
public class 数组中出现次数超过一半的数字 {
    public int MoreThanHalfNum_Solution(int[] array) {
        Arrays.sort(array);
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[array.length / 2]) {
                count++;
            }
        }
        if (count > array.length / 2) {
            return array[array.length / 2];
        }
        return 0;
    }
}

