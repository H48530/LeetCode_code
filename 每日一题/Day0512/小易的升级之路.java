package Day0512;

import java.util.Scanner;

/**
 *
 */
public class 小易的升级之路 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int[] arr = new int[a];
            for (int i = 0; i < a; i++) {
                arr[i] = sc.nextInt();
            }

            int ret = func(arr, b);
            System.out.println(ret);
        }
    }

    private static int func(int[] arr, int b) {
        for (int i : arr) {
            if (b >= i) {
                b += i;
            } else {
                int ret = func2(i, b);
                b += ret;
            }
        }
        return b;
    }

    private static int func2(int i, int b) {
        int s = i % b;
        while (s != 0) {
            i = b;
            b = s;
            s = i % b;
        }
        return b;
    }
}
