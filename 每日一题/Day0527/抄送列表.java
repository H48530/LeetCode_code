package Day0527;

import java.util.Scanner;

/**
 *
 */
public class 抄送列表 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            if (!s1.contains(s2)) {
                System.out.println("Important!");
            } else {
                int ret = s1.indexOf(s2);
                if (s1.charAt(ret + s2.length()) == '\"') {
                    System.out.println("Important!");
                } else {
                    System.out.println("Ignore");
                }
            }
        }
    }
}
