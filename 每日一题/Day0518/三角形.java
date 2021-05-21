package Day0518;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 */
public class 三角形 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            double[]arr = new double[3];
            arr[0] = sc.nextDouble();
            arr[1] = sc.nextDouble();
            arr[2] = sc.nextDouble();

            Arrays.sort(arr);

            if(arr[0]+arr[1]>arr[2]){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
