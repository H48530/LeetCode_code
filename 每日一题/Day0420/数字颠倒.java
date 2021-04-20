package Day0420;

import java.util.*;

/**
 *
 */
public class 数字颠倒 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = String.valueOf(a);
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
        }
        sb.reverse();
        System.out.println(sb.toString());
    }
}