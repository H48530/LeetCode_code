package Day0506;

import java.util.Scanner;

/**
 *
 */
public class iNOC产品部_杨辉三角的变形 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n <= 2) {
                System.out.println(-1);
            } else if (n % 2 == 1) {
                System.out.println(1);
            } else {
                if (n % 4 == 0) {
                    System.out.println(2);
                } else {
                    System.out.println(4);
                }
            }
        }
    }
}
