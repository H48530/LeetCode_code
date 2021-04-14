package Day0414;

import java.util.Scanner;

/**
 *
 */
public class 计算糖果 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();


        int A = (a + c) / 2;
        int B = c - A;
        int C = d - B;
        if (B-C ==b){
            System.out.printf("%d %d %d\n", A, B, C);
        }else {
            System.out.println("No");
        }
    }
}
