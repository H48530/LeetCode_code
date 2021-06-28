package Day0628;

/**
 *生成一个数组 https://leetcode-cn.com/problems/get-maximum-in-generated-array/
 */
public class 获取数组中的最大值 {
    public int getMaximumGenerated(int n) {
        if (n <= 1) {
            return n;
        }
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;

        int max = arr[0];
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                arr[i] = arr[i / 2];
                if (arr[i] > max) {
                    max = arr[i];
                }
            } else {
                arr[i] = arr[i / 2] + arr[i / 2 + 1];
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
        }
        return max;
    }
}
