package Day0525;

import java.util.Scanner;

/**
 *
 */
public class 剪花布条 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] split = s.split(" ");
            String s1 = split[0];
            String s2 = split[1];

            if (!s1.contains(s2)) {
                System.out.println(0);
                continue;
            }
            int size = s2.length();
            int count = 0;
            int index = 0;
            while (true) {
                index = s1.indexOf(s2);
                if (index == -1) {
                    break;
                }
                s1 = s1.substring(index + size);
                if (index + size > s1.length()) {
                    break;
                }
                count++;
            }
            System.out.println(count+1);
        }
    }
}
