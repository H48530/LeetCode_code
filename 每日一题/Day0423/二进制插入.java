package Day0423;

import java.util.Arrays;

/**
 *
 */
public class 二进制插入 {
    public static int binInsert(int n, int m, int j, int i) {
        // write code here
        char[] array1 = Integer.toBinaryString(n).toCharArray();
        char[] array2 = Integer.toBinaryString(m).toCharArray();

        int x = array1.length - 1 - j;
        int y = array2.length - 1;

        while (x >= array1.length - 1 - i) {
            if (array1[x] == '0') {
                array1[x] = array2[y];
                y--;
            }
            x--;
        }
        //二进制转10进制
        int sum = 0;
        int sz = array1.length;
        for (int k = 0; k < sz; k++) {
            sum += (array1[k] - '0') * Math.pow(2, sz - k - 1);
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 1024;
        int m = 20;
        int j = 2;
        int i = 6;

        System.out.println(binInsert(n, m, j, i));
    }
}
