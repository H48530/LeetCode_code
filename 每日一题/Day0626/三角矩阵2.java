package Day0626;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class 三角矩阵2 {
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {

        if (triangle.isEmpty()) {
            return 0;
        }
        List<List<Integer>> minPathSum = new ArrayList<>(triangle);
        int row = minPathSum.size();

        for (int i = row - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                int curSum = Math.min(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1)) + triangle.get(i).get(j);
                minPathSum.get(i).set(j, curSum);
            }
        }
        return minPathSum.get(0).get(0);
    }
}
