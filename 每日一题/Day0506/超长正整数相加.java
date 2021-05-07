package Day0506;

import java.util.Scanner;

/**
 *
 */
public class 超长正整数相加 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String s = AddLongInteger(s1, s2);
            System.out.println(s);
        }
    }

    private static String AddLongInteger(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        int size1 = arr1.length - 1;
        int size2 = arr2.length - 1;
        int count = 0;

        StringBuilder sb = new StringBuilder();
        while (size1 >= 0 && size2 >= 0) {
            int a = arr1[size1] - '0';
            int b = arr2[size2] - '0';
            sb.append((a + b + count) % 10);
            count = (a + b + count) / 10;
            size1--;
            size2--;
        }
        if (size1 < 0) {
            while (size2 >= 0) {
                int a = arr2[size2] - '0';
                sb.append((a + count) % 10);
                count = (a + count) / 10;
                if (size2 == 0 && count != 0) {
                    sb.append(1);
                }
                size2--;
            }
        } else {
            while (size1 >= 0) {
                int a = arr1[size1] - '0';
                sb.append((a + count) % 10);
                count = (a + count) / 10;
                if (size1 == 0 && count != 0) {
                    sb.append(1);
                }
                size1--;
            }
        }
        return sb.reverse().toString();
    }
}
