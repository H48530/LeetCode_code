package Day0526;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 */
public class 收件人列表 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while (sc.hasNext()) {
            int n = sc.nextInt();
            while (n >= 0) {
                list.add(sc.nextLine());
                n--;
            }
            list.remove(0);
            while (!list.isEmpty()) {
                String s = list.remove(0);
                if (s.contains(" ") || s.contains(",")) {
                    System.out.printf("\"%s\"", s);
                    if (list.size() != 0) {
                        System.out.printf(", ");
                    }
                } else {
                    System.out.printf("%s", s);
                    if (list.size() != 0) {
                        System.out.printf(", ");
                    }
                }
            }
            System.out.println();
        }
    }
}
