package Day0513;

import java.util.Scanner;

/**
 *
 */
public class 计算字符串的距离 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            int i = calStringDistance(s1, s2);
            System.out.println(i);
        }
    }

    public static int calStringDistance(String charA, String charB) {
        int size1 = charA.length();
        int size2 = charB.length();
        int count = 0;
        if (size1 == size2) {
//            for (int i = 0; i < size1; i++) {
//                if (charA.charAt(i) != charB.charAt(i)) {
//                    count++;
//                }
//            }
            String max = charA;
            String min = charB;
            int index = max.indexOf(min.charAt(0));
            if (index == -1) {
                return max.length();
            }
            for (int i = 0; i < min.length()-index; i++) {
                if (min.charAt(i) != max.charAt(index + i)) {
                    count++;
                }
            }
            return count + index;

        } else {
            String max = size1 > size2 ? charA : charB;
            String min = size1 < size2 ? charA : charB;

            int index = max.indexOf(min.charAt(0));
            if (index == -1) {
                return max.length();
            }
            for (int i = 0; i < min.length(); i++) {
                if (min.charAt(i) != max.charAt(index + i)) {
                    count++;
                }
            }
            return count + (max.length() - min.length());
        }
    }
}
