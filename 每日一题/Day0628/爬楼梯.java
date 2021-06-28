package Day0628;

/**
 * 斐波那契数列
 */
public class 爬楼梯 {
    public int climbStairs(int n) {
        if (n == 0) {
            return 0;
        }
        if (n <= 2) {
            return n;
        }
        int[] arr = new int[n+1];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        return arr[n];
    }
}
