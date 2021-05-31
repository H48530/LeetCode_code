package m5.Day0530;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 */
public class mkdir {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            String[] arr = new String[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.next();
            }
            Arrays.sort(arr);
            List<String> res = new ArrayList<>();
            for (int i = 1; i < arr.length; i++) {
                if (!arr[i].startsWith(arr[i - 1] + "/")) res.add(arr[i - 1]);
            }
            res.add(arr[n - 1]);
            for (String s : res) {
                System.out.println("mkdir -p " + s);
            }
            System.out.println();
        }
    }
}
