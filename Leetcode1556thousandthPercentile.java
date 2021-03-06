import java.util.Scanner;

public class Leetcode1556thousandthPercentile {
    //千分位
    public static String thousandSeparator(int n) {
        if (n == 0) {//当n为0的时候，直接返回0
            return "0";
        }
        int count = 0;
        String st = " ";
        while (n > 0) {
            int d = n % 1000;
            String sd = String.valueOf(d);
            //当其中有0的时候，控制为3位，补0
            if (n >= 1000 && sd.length() < 3) {
                if (sd.length() == 0) {
                    sd = "000";
                } else if (sd.length() == 1) {
                    sd = "00" + sd;
                } else {
                    sd = "0" + sd;
                }
            }
            //控制最后3位后面没有小数点
            if (count == 0) {
                st = sd;
            } else {
                st = sd + "." + st + "";
            }
            n /= 1000;
            count++;
        }
        return st;
    }

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            String str = thousandSeparator(n);
            System.out.println(str);
        }
    }
}
