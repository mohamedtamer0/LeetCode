class Solution {
    int[] dx = {1, -1, 0, 0};
    int[] dy = {0, 0, 1, -1};
    boolean[][] visited;

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int m = image.length, n = image[0].length;
        visited = new boolean[m][n];
        dfs(image, sr, sc, image[sr][sc], newColor);
        return image;
    }

    private void dfs(int[][] image, int sr, int sc, int original, int newColor) {
        image[sr][sc] = newColor;
        visited[sr][sc] = true;

        for (int i = 0; i < 4; i++) {
            int x = sr + dx[i], y = sc + dy[i];
            if (validate(image, x, y, original)) {
                dfs(image, x, y, original, newColor);
            }
        }
    }

    private boolean validate(int[][] image, int x, int y, int original) {
        int m = image.length, n = image[0].length;
        return x >= 0 && x < m && y >= 0 && y < n && image[x][y] == original && !visited[x][y];
    }
}