package Day0413;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 */
public class 字符串中找出连续最长的数字串 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            char[] array = s.toCharArray();


            char[] arr = new char[array.length];

            for (int i = 0; i < array.length ; i++) {
                if (array[i] >= 48 && array[i] < 58) {
                    arr[i] = array[i];
                } else {
                    arr[i] = ' ';
                }
            }

            StringBuilder s2 = new StringBuilder();
            for (char c : arr) {
                s2.append(c);
            }
            String[] split = s2.toString().split(" ");
            int max = -1;
            String a = "";
            for (String s1 : split) {
                if (s1.length() > max) {
                    a = s1;
                    max = s1.length();
                }
            }
            for (int i = 0; i < a.length(); i++) {
                System.out.printf("%c", a.charAt(i));
            }
        }
    }
}

