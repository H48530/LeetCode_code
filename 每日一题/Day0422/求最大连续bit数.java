package Day0422;

import java.util.*;

/**
 *
 */


public class 求最大连续bit数 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            byte a = sc.nextByte();
            String s = Integer.toBinaryString(a);
            String[] split = s.split("0");
            int max = 0;
            for (String s1 : split) {

                max = Integer.max(max, s1.length());
            }

            System.out.println(max);

//        int max = 0;
//        int count = 0;
//        while (a != 0) {
//            if ((a & 1) == 1) {
//                count++;
//                max = count;
//            } else {
//                max = Integer.max(count, max);
//                count = 0;
//            }
//
//            a >>>= 1;
//
//        }
//        System.out.println(max);
//    }
            System.out.println(s);
        }
    }
}
