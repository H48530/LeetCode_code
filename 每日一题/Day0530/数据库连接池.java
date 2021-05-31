package m5.Day0530;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 */
public class 数据库连接池 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int max = 0;
            int length = 0;
            for (int i = 0; i < n; i++) {
                sc.next();
                String s = sc.next();
                if (s.equals("connect")) {
                    length++;
                    if (max < length) {
                        max = length;
                    }
                } else {
                    length--;
                }
            }
            System.out.println(max);
        }
    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            int length = 0;
//            int maxLength = 0;
//            int n =  sc.nextInt();
//
//            for (int i = 0; i <n ; i++) {
//                String id = sc.next();
//                String action = sc.next();
//
//                if (action.equals("connect")) {
//                    length++;
//                    if (maxLength < length) {
//                        maxLength = length;
//                    }
//                } else {
//                    length--;
//                }
//            }
//            System.out.println(maxLength);
//        }
//    }
}


