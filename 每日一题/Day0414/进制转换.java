package Day0414;

import java.util.Scanner;

/**
 *
 */
public class 进制转换 {
    public static void main1(int m, int n) {
//        Scanner sc = new Scanner(System.in);
//        int m = sc.nextInt();
//        int n = sc.nextInt();
        StringBuilder ret = new StringBuilder();

        while (m > 0) {
            switch (m % n) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    ret.append(m % n);
                    m = m / n;
                    break;
                case 10:
                    ret.append('A');
                    m = m / n;
                    break;
                case 11:
                    ret.append('B');
                    m = m / n;
                    break;
                case 12:
                    ret.append('C');
                    m = m / n;
                    break;
                case 13:
                    ret.append('D');
                    m = m / n;
                    break;
                case 14:
                    ret.append('E');
                    m = m / n;
                    break;
                case 15:
                    ret.append('F');
                    m = m / n;
                    break;
                default:
                    m = m / n;
                    break;
            }
        }
        System.out.println(ret.reverse());
    }

    public static void main(String[] args) {
//        for (int i = 2; i <= 16; i++) {
//            main1(9999, 2);
//        }
        main1(8, 2);
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        StringBuilder ret = new StringBuilder();
        boolean negative = false;
        if (m < 0) {
            negative = true;
        }

        while (m > 0) {
            switch (m % n) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    ret.append(m % n);
                    m = m / n;
                    break;
                case 10:
                    ret.append('A');
                    m = m / n;
                    break;
                case 11:
                    ret.append('B');
                    m = m / n;
                    break;
                case 12:
                    ret.append('C');
                    m = m / n;
                    break;
                case 13:
                    ret.append('D');
                    m = m / n;
                    break;
                case 14:
                    ret.append('E');
                    m = m / n;
                    break;
                case 15:
                    ret.append('F');
                    m = m / n;
                    break;
                default:
                    m = m / n;
                    break;
            }
        }
        System.out.println((negative ? "-" : "") + ret.reverse());
    }
}