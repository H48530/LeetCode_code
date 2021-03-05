package day07;

/**
 * 905. 按奇偶排序数组   https://leetcode-cn.com/problems/sort-array-by-parity/
 * 给定一个非负整数数组 A，返回一个数组，在该数组中， A 的所有偶数元素之后跟着所有奇数元素。
 * 你可以返回满足此条件的任何数组作为答案。
 * 示例:
 * 输入：[3,1,2,4]
 * 输出：[2,4,3,1]
 * 输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
 */
class Solution {
    public int[] sortArrayByParity(int[] A) {
        int left = 0;
        int right = A.length - 1;
        while (left <= right) {
            if (A[left] % 2 == 0) {
                left++;
                continue;
            }
            if (!(A[right] % 2 == 0)) {
                right--;
                continue;
            }
            int tmp = A[left];
            A[left] = A[right];
            A[right] = tmp;
            left++;
            right--;
        }
        return A;
    }
}

public class 按奇偶排序数组 {
}
