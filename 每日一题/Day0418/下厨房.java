package Day0418;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 */
public class 下厨房 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> set = new TreeSet<>();
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            if (s.equals(" ")) {
                break;
            }
            String[] s1 = s.trim().split(" ");
            for (String s2 : s1) {
                set.add(s2);
            }

        }
        System.out.println(set.size());
    }
}
