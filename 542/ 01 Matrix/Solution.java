class Solution {
    public final int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int[][] updateMatrix(int[][] mat) {
        int rowCount = mat.length;
        int colCount = mat[0].length;
        int[][] res = new int[rowCount][colCount];

        //Initialize
        for (int i = 0; i < rowCount; ++i) {
            for (int j = 0; j < colCount; ++j) {
                res[i][j] = Integer.MAX_VALUE;
            }
        }


        // Update from top-left
        for (int i = 0; i < rowCount; ++i) {
            for (int j = 0; j < colCount; ++j) {
                update(mat, res, rowCount, colCount, i, j);
            }
        }


        // Update from bottom-right
        for (int i = rowCount - 1; i > -1; --i) {
            for (int j = colCount - 1; j > -1; --j) {
                update(mat, res, rowCount, colCount, i, j);
            }
        }


        return res;

    }

    public void update(int[][] src, int[][] out, int rowCount, int colCount, int i, int j) {
        if (src[i][j] == 0) {
            out[i][j] = 0;
            return;
        }

        for (int[] d : directions) {
            int x = i + d[0];
            int y = j + d[1];
            if (0 <= x && x < rowCount && 0 <= y && y < colCount && out[x][y] != Integer.MAX_VALUE && out[x][y] + 1 < out[i][j]) {
                out[i][j] = out[x][y] + 1;
            }
        }
    }
}