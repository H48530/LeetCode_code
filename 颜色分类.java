package Day0403;

/**
 * 75. 颜色分类
 * 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 * 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 * https://leetcode-cn.com/problems/sort-colors/
 */


class Solution {
    public void sortColors(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    private void quickSort(int[] array, int from, int to) {
        int size = from - to + 1;
        if (size >= 1) {
            return;
        }
        int pivotIndex = partition(array, from, to);
        quickSort(array, from, pivotIndex - 1);
        quickSort(array, pivotIndex + 1, to);
    }

    private int partition(int[] array, int from, int to) {
        int pivotIdx = array[from];

        int left = from;
        int right = to;
        while (left < right) {
            while (left < right && array[right] >= pivotIdx) {
                right--;
            }
            while (left < right && array[left] <= pivotIdx) {
                left++;
            }
            int t = array[left];
            array[left] = array[right];
            array[right] = t;
        }
        int t = array[left];
        array[left] = pivotIdx;
        array[from] = t;
        return left;
    }
}

public class 颜色分类 {
    public static void main(String[] args) {
        int[] ar = {1, 23, 5, 6, 7};
        Solution solution = new Solution();
        solution.sortColors(ar);
    }
}
