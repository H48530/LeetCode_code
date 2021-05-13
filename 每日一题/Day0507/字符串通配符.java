package Day0507;

import java.util.Scanner;

/**
 *
 */
public class 字符串通配符 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            System.out.println(isString(s1, s2));
        }
    }

    private static boolean isString(String s1, String s2) {
        char[] array1 = s1.toUpperCase().toCharArray();
        char[] array2 = s2.toUpperCase().toCharArray();
        int i = 0;
        int j = 0;
        int size1 = array1.length - 1;
        int size2 = array2.length - 1;
        while (i <= size1 && j <= size2) {
            if (array1[i] == array2[j]) {
                i++;
                j++;
            } else {
                if (array1[i] == '?') {
                    i++;
                    j++;
                }else if (array1[i] == '*') {
                    j = size2 + 1;
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}
