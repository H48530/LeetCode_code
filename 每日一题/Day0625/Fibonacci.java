package Day0625;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Fibonacci {
    public int Fibonacci(int n) {
        if (n < 0) {
            return 0;
        }
        int[] array = new int[n + 1];
        array[0] = 0;
        array[1] = 1;

        for (int i = 2; i <= n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[n];
    }
}
