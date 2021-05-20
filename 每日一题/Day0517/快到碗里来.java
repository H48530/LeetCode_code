package Day0517;

import java.util.*;

/**
 *
 */
public class 快到碗里来 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextDouble()) {
            double n = sc.nextDouble();
            double r = sc.nextDouble();

            if (2 * 3.14 * r < n) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}