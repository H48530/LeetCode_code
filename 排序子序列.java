package Day0412;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 */
public class 排序子序列 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int cnt = 1;
            for (int i = 1; i < n - 1; i++) {
                if (a[i] > a[i - 1] && a[i] > a[i + 1] || a[i] < a[i - 1] && a[i] < a[i + 1]) {
                    cnt++;
                    if (n - 3 != i) {
                        i++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
