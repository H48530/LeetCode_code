package day13;

/**   https://leetcode-cn.com/problems/longest-increasing-path-in-a-matrix/
 * 矩阵中的最长递增路径
 * 给定一个 m x n 整数矩阵 matrix ，找出其中 最长递增路径 的长度。
 *
 * 对于每个单元格，你可以往上，下，左，右四个方向移动。 你 不能 在 对角线 方向上移动或移动到 边界外（即不允许环绕）。

 * 示例 1：
 * 输入：matrix = [[9,9,4],[6,6,8],[2,1,1]]
 * 输出：4
 * 解释：最长递增路径为 [1, 2, 6, 9]。
 * 示例 2：
 * 输入：matrix = [[3,4,5],[3,2,6],[2,2,1]]
 * 输出：4
 * 解释：最长递增路径是 [3, 4, 5, 6]。注意不允许在对角线方向上移动。
 * 示例 3：
 * 输入：matrix = [[1]]
 * 输出：1
 */
class Solution1 {
    public int longestIncreasingPath(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length ==0){
            return 0;
        }
        int[][] len = new int[matrix.length][matrix[0].length];//记录每一格的最长递增路径长度
        int max = 0;//记录最长的路径长度
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(len[i][j] == 0){//如果当前格子还未记录过就进入dfs搜索
                    dfs(matrix,len,i,j);
                    max = Math.max(max,len[i][j]);
                }
            }
        }
        return max;
    }

    private void dfs(int[][] matrix, int[][] len , int i, int j) {
        len[i][j] = 1;//先赋初始值1
        //按上下左右顺序检查比当前格子大的格子的最长递增路径长度，如果这些格子未赋值则递归赋值
        //当前格子的最长递增路径长度 = max(原长度 , 较大相邻格子长度+1)
        if(i-1>=0 && matrix[i-1][j] > matrix[i][j]){
            if(len[i-1][j] == 0){
                dfs(matrix,len,i-1,j);
            }
            len[i][j] = Math.max(len[i][j],len[i-1][j]+1);
        }
        if(i+1<matrix.length && matrix[i+1][j] > matrix[i][j]){
            if(len[i+1][j] == 0){
                dfs(matrix,len,i+1,j);
            }
            len[i][j] = Math.max(len[i][j],len[i+1][j]+1);
        }
        if(j-1>=0 && matrix[i][j-1] > matrix[i][j]){
            if(len[i][j-1] == 0){
                dfs(matrix,len,i,j-1);
            }
            len[i][j] = Math.max(len[i][j],len[i][j-1]+1);
        }
        if(j+1<matrix[i].length && matrix[i][j+1] > matrix[i][j]){
            if(len[i][j+1] == 0){
                dfs(matrix,len,i,j+1);
            }
            len[i][j] = Math.max(len[i][j],len[i][j+1]+1);
        }
    }
}
public class 矩阵中最长递增路径 {
}
