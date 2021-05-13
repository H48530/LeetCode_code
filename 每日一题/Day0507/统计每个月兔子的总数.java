package Day0507;

import java.util.Scanner;

/**
 *
 */
public class 统计每个月兔子的总数 {
    public static void main(String[] args) {
        //F(i) = F(i-1)+F(i-2)
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int ret = function(n);
            System.out.println(ret);
        }
    }

    private static int function(int n) {
        if (n <= 2) {
            return 1;
        }
        return function(n-1)+function(n-2);

    }
}
