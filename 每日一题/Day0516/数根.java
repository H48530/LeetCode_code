package Day0516;

import java.util.*;

/**
 * 注意大数运算
 * 字符串和数字的计算
 */
public class 数根 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String n = sc.next();

            long ret = numberRoot(n);

            System.out.println(ret);
        }
    }

    private static long numberRoot(String num) {
        while (num.length() > 1) {
            int ret = 0;
            for (int i = 0; i < num.length(); i++) {
                ret += num.charAt(i) - '0';
            }
            num = String.valueOf(ret);
        }
        return num.charAt(0)-'0';
    }
}