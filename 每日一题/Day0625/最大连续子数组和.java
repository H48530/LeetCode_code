package Day0625;

/**
 *
 */
public class 最大连续子数组和 {

    public int FindGreatestSumOfSubArray(int[] array) {
        int max = array[0];
        int sum = array[0];

        for (int i = 1; i < array.length; i++) {
            max = Math.max(max + array[i], array[i]);

            if (max > sum) {
                sum = max;
            }
        }
        return sum;
    }
}
