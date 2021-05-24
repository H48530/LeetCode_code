package Day0524;

import java.awt.peer.ListPeer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 */
public class 分解因数 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (isPrimer(n)) {
                System.out.printf("%d = %d\n", n, n);
                continue;
            }
            int a = n;
            int count = 0;
            List<Integer> list = new ArrayList<>();
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    while (a % i == 0) {
                        a /= i;
                        count++;
                    }
                    for (int j = 0; j < count; j++) {
                        list.add(i);
                    }
                }
            }
            if (a != 1) {
                list.add(a);
            }
            System.out.printf("%d = ", n);
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i));
                if (i != list.size() - 1) {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }

    private static boolean isPrimer(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
