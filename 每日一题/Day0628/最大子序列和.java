package Day0628;

/**
 *
 */
public class 最大子序列和 {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int max = nums[0];
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max + nums[i], nums[i]);
            if (max > sum) {
                sum = max;
            }
        }
        return sum;
    }
}
