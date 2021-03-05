package day08;

import java.util.Arrays;

/**
 * 414. 第三大的数
 * 给你一个非空数组，返回此数组中 第三大的数 。如果不存在，则返回数组中最大的数。
 * 示例 1：
 * 输入：[3, 2, 1]
 * 输出：1
 * 解释：第三大的数是 1 。
 * 示例 2：
 * 输入：[1, 2]
 * 输出：2
 * 解释：第三大的数不存在, 所以返回最大的数 2 。
 * 示例 3：
 * 输入：[2, 2, 3, 1]
 * 输出：1
 * 解释：注意，要求返回第三大的数，是指第三大且唯一出现的数。
 * 存在两个值为2的数，它们都排第二。
 */

class Solution1 {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int max = 1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] != nums[i - 1]) {
                max++;
            }
            if (max == 3) {
                return nums[i - 1];
            }
        }
        return nums[nums.length - 1];
    }
}

public class 第三大的数 {
}
