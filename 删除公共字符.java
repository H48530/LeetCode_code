package Day0411;

import java.util.Scanner;

/**
 *
 */
public class 删除公共字符 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            char[] array1 = s1.toCharArray();
            char[] array2 = s2.toCharArray();
            StringBuilder sb = new StringBuilder();

            for (char c : array1) {
                boolean flag = true;
                for (char c2 : array2) {
                    if (c == c2) {
                        flag = false;
                    }
                }
                if (flag ) {
                    sb.append(c);
                }
            }
            System.out.println(sb.toString());
        }
    }
}
