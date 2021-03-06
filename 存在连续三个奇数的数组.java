package day0304;

import java.util.ArrayList;

/**
 * 1550. 存在连续三个奇数的数组
 * 给你一个整数数组 arr，请你判断数组中是否存在连续三个元素都是奇数的情况：如果存在，请返回 true ；否则，返回 false 。
 * 示例 1：
 * 输入：arr = [2,6,4,1]
 * 输出：false
 * 解释：不存在连续三个元素都是奇数的情况。
 * 示例 2：
 * 输入：arr = [1,2,34,3,4,5,7,23,12]
 * 输出：true
 * 解释：存在连续三个元素都是奇数的情况，即 [5,7,23] 。
 */

class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int elem : arr) {
            list.add(elem);
        }
        int i = 0;
        int j = 1;
        int k = 2;
        while (k <= list.size() - 1) {
            if (list.get(i) % 2 != 0 && list.get(j) % 2 != 0 && list.get(k) % 2 != 0) {
                return true;
            }
            i++;
            j++;
            k++;
        }
        return false;
    }
}

public class 存在连续三个奇数的数组 {
}
