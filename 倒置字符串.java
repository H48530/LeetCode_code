package Day0412;

import java.util.Scanner;

/**
 *
 */
public class 倒置字符串 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] s1 = s.split(" ");
            for (int i = s1.length - 1; i >= 0; i--) {
                System.out.printf("%s ", s1[i]);
            }
        }
    }
}
