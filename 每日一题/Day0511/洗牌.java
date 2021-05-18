package Day0511;

import java.util.Scanner;

/**
 *
 */
public class 洗牌 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int T = sc.nextInt();
            for (int i = 0; i < T; i++) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                int[] array = new int[2 * n];
                for (int j = 0; j < 2 * n; j++) {
                    array[j] = sc.nextInt();
                }
                func(array, n, k);
            }
        }
    }

    private static void func(int[] array, int n, int k) {
        for (int i = 0; i < k; i++) {
            //洗牌
            int[] a = new int[2 * n];
            int left = n - 1;
            int right = 2 * n - 1;
            for (int j = 0; j < n; j++) {
                a[j] = array[right];
                a[j + 1] = array[left];
                right--;
                left--;
            }
        }
        for (int i = 2 * n; i > 0; i--) {
            System.out.printf("%d ", i);
        }
        System.out.printf("%d ", array[0]);
    }
}
