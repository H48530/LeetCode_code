package Day0427;

import java.util.Scanner;

/**
 *
 */
public class 查找输入整数中二进制中1的个数 {

    public static int findNumberOf1(int num) {
        int count = 0;
        while (num > 0) {
            num = num & (num - 1);
            count++;
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nextInt = sc.nextInt();
        int n = findNumberOf1(nextInt);
        System.out.println(n);
    }
}
