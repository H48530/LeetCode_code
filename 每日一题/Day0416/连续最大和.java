package Day0416;

import java.util.*;

/**
 *    max(f(i-1)+arr[i],arr[i])
 */
public class 连续最大和 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxSum = arr[0];
        int curSum = arr[0];
        for (int i = 0; i < n; i++) {
            curSum = Math.max(curSum + arr[i], arr[i]);
            if (curSum > maxSum) {
                maxSum = curSum;
            }
        }
        System.out.println(maxSum);
    }
}
