package Day0410;

import sun.text.normalizer.UCharacter;

import java.util.*;

/**
 * 旧键盘      https://www.nowcoder.com/questionTerminal/f88dafac00c8431fa363cd85a37c2d5e
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            char[] array1 = sc.nextLine().toUpperCase().toCharArray();
            char[] array2 = sc.nextLine().toUpperCase().toCharArray();

            Set<Character> set = new TreeSet<>();
            for (char c : array2) {
                set.add(c);
            }

            List<Character> list = new ArrayList<>();
            for (char c : array1) {
                if (!set.contains(c)&&!list.contains(c)) {
                    list.add(c);
                }
            }
            for (char e : list) {
                System.out.print(e);
            }
            System.out.println();
        }
    }
}
