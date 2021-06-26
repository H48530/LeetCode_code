package Day0626;

import java.util.ArrayList;
import java.util.List;

/**
 * 正向
 */
public class 三角矩阵 {
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        if (triangle.isEmpty()) {
            return 0;
        }
        List<List<Integer>> minPathSum = new ArrayList<>();
        for (int i = 0; i < triangle.size(); i++) {
            minPathSum.add(new ArrayList<>());
        }

        minPathSum.get(0).add(triangle.get(0).get(0));

        for (int i = 1; i < triangle.size(); i++) {
            int curSum = 0;
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    curSum = minPathSum.get(i - 1).get(0);
                } else if (j == i) {
                    curSum = minPathSum.get(i - 1).get(j - 1);

                } else {
                    curSum = Math.min(minPathSum.get(i - 1).get(j), minPathSum.get(i - 1).get(j - 1));
                }
                minPathSum.get(i).add(triangle.get(i).get(j) + curSum);
            }
        }
        int size = triangle.size();
        int allMin = minPathSum.get(size - 1).get(0);
        for (int i = 1; i < size; i++) {
            allMin = Math.min(allMin, minPathSum.get(size - 1).get(i));
        }
        return allMin;
    }
}
