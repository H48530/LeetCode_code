package Day0627;

/**
 *
 */
public class 最小路径和 {
    public int minPathSum(int[][] grid) {
        // write code here
        int row = grid.length;
        int col = grid[0].length;

        if (row == 0 || col == 0) {
            return 0;
        }
        for (int i = 1; i < row; i++) {
            grid[i][0] = grid[i - 1][0] + grid[i][0];
        }
        for (int i = 1; i < col; i++) {
            grid[0][i] = grid[0][i - 1] + grid[0][i];
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                grid[i][j] = Math.min(grid[i - 1][j], grid[i][j - 1]) + grid[i][j];
            }
        }
        return grid[row - 1][col - 1];
    }
}
