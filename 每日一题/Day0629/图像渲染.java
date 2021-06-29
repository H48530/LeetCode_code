package Day0629;

/**
 *
 */
public class 图像渲染 {

    int[][] nextPosition = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public void DFS(int[][] image, int row, int col, int[][] book, int sr, int sc, int oldColor, int newColor) {
        image[sr][sc] = newColor;
        book[sr][sc] = 1;

        for (int k = 0; k < 4; k++) {
            int newr = sr + nextPosition[k][0];
            int newc = sc + nextPosition[k][1];
            if (newr >= row || newr < 0 || newc >= col || newc < 0) {
                continue;
            }
            if (image[newr][newc] == oldColor && book[newr][newc] == 0) {
                DFS(image, row, col, book, newr, newc, oldColor, newColor);
            }
        }

    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        int row = image.length;
        int col = image[0].length;

        int[][] book = new int[row][col];
        DFS(image, row, col, book, sr, sc, oldColor, newColor);

        return image;
    }

}
