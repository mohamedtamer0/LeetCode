import java.util.LinkedList;

class Solution {
    public int orangesRotting(int[][] grid) {
        LinkedList<int[]> list = new LinkedList<>();
        int r = grid.length, c = grid[0].length;
        int freshCount = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 2) list.add(new int[]{i, j});
                if (grid[i][j] == 1) freshCount++;
            }
        }
        int res = 0;
        while (!list.isEmpty() && freshCount != 0) {
            res++;
            int size = list.size();
            while (size > 0) {
                size--;
                int[] t = list.removeFirst();
                if (t[0] > 0 && grid[t[0] - 1][t[1]] == 1) {
                    freshCount--;
                    grid[t[0] - 1][t[1]] = 2;
                    list.add(new int[]{t[0] - 1, t[1]});
                }
                if (t[0] + 1 < r && grid[t[0] + 1][t[1]] == 1) {
                    freshCount--;
                    grid[t[0] + 1][t[1]] = 2;
                    list.add(new int[]{t[0] + 1, t[1]});
                }
                if (t[1] > 0 && grid[t[0]][t[1] - 1] == 1) {
                    freshCount--;
                    grid[t[0]][t[1] - 1] = 2;
                    list.add(new int[]{t[0], t[1] - 1});
                }
                if (t[1] + 1 < c && grid[t[0]][t[1] + 1] == 1) {
                    freshCount--;
                    grid[t[0]][t[1] + 1] = 2;
                    list.add(new int[]{t[0], t[1] + 1});
                }
            }
        }
        return freshCount == 0 ? res : -1;
    }
}