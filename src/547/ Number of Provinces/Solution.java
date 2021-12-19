

class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int components = 0;
        for (int vertex = 0; vertex < n; vertex++) {
            if (!visited[vertex]) {
                visited[vertex] = true;
                components++;
                visitNeighbors(vertex, isConnected, visited);
            }
        }
        return components;
    }

    private void visitNeighbors(int vertex, int[][] isConnected, boolean[] visited) {
        for (int v = 0; v < isConnected.length; v++) {
            if (isConnected[vertex][v] == 1 && !visited[v]) {
                visited[v] = true;
                visitNeighbors(v, isConnected, visited);
            }
        }
    }
}