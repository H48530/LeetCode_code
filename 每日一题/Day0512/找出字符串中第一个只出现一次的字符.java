package Day0512;

import java.util.*;

/**
 *
 */
public class 找出字符串中第一个只出现一次的字符 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            char[] arr = s.toCharArray();
            char ret = ' ';
            for (int i = 0; i < arr.length; i++) {
                if (s.indexOf(arr[i]) == s.lastIndexOf(arr[i])) {
                    ret = arr[i];
                    break;
                }
            }
            if (ret != ' ') {
                System.out.println(ret);
            } else {
                System.out.println(-1);
            }
        }
    }
}
