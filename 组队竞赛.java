package Day0411;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 */
public class 组队竞赛 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int s = sc.nextInt();

            int n = 3 * s;
            int[] arr = new int[n];
            while (n > 0) {
                arr[n - 1] = sc.nextInt();
                n--;
            }
            Arrays.sort(arr);
            int sum = 0;
            int l = s;
            for (int i = s; i > 0; i--) {
                sum += arr[l];
                l = l + 2;
            }
            System.out.println(sum);
        }
    }
}
