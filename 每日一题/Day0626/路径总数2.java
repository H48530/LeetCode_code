package Day0626;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class 路径总数2 {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // write code here
        List<List<Integer>> pathNum = new ArrayList<>();
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        for (int i = 0; i < m; i++) {
            pathNum.add(new ArrayList<>());

            if (obstacleGrid[i][0] == 1) {
                pathNum.get(i).add(0);
            } else {
                if (i > 0) {
                    if (pathNum.get(i - 1).get(0) == 1) {
                        pathNum.get(i).add(1);
                    } else {
                        pathNum.get(i).add(0);
                    }
                } else {
                    pathNum.get(i).add(1);
                }
            }
        }

        for (int i = 1; i < n; i++) {
            if (obstacleGrid[0][i] == 1) {
                pathNum.get(0).add(0);
            } else {
                if (pathNum.get(0).get(i - 1) == 1) {
                    pathNum.get(0).add(1);
                } else {
                    pathNum.get(0).add(0);
                }
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    pathNum.get(i).add(0);
                } else {
                    pathNum.get(i).add(pathNum.get(i).get(j - 1) + pathNum.get(i - 1).get(j));
                }
            }
        }
        return pathNum.get(m - 1).get(n - 1);
    }
}
