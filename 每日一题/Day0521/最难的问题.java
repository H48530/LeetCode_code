package Day0521;

import java.util.Scanner;

/**
 *
 */
public class 最难的问题 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    System.out.print(s.charAt(i));
                    continue;
                }
                int i1 = s.charAt(i) - 5;
                if (i1 < 'A') {
                    i1 += 26;
                }
                System.out.print((char) i1);
            }
            System.out.println();
        }
    }
}
