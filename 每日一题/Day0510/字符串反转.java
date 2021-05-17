package Day0510;

import java.util.*;

/**
 *
 */
public class 字符串反转 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            char[] arr = s.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (char c : arr) {
                sb.append(c);
            }

            System.out.println(sb.reverse().toString());
        }
    }
}