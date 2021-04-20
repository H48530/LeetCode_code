package Day0420;

import java.util.*;

/**
 *
 */
public class 末尾0的个数 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 1 && n > 1000) {
            return;
        }
        long count = 0;

        for (int i = n; i >= 5; i--) {
            int tmp = i;
            while (tmp % 5 == 0) {
                count++;
                tmp /= 5;
            }
        }
        System.out.println(count);
    }
}