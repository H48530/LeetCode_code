package Day0509;

import java.util.Scanner;

/**
 *
 */
public class 查找两个字符串中最长公共子串 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            String s = func(s1, s2);
            System.out.println(s);
        }
    }


    private static String func(String s1, String s2) {
        String max = s1.length() >= s2.length() ? s1 : s2;
        String min = s1.length() >= s2.length() ? s2 : s1;
        int l = 0;
        String ret = "";
        for (int i = 0; i < min.length(); i++) {
            for (int j = i + 1; j <= min.length(); j++) {
                if (max.contains(min.substring(i, j)) && j - i > l) {
                    l = j - i;
                    ret = min.substring(i, j);
                }
            }
        }
        return ret;
    }
}
