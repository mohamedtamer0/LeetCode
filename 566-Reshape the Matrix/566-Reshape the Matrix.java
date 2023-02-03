class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int numberOfElement = mat.length * mat[0].length;
        if (numberOfElement != r * c)
            return mat;

        int[] expandedArrary = new int[numberOfElement];
        int k = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                expandedArrary[k] = mat[i][j];
                k++;
            }
        }

        int[][] answer = new int[r][c];
        int i = 0;
        int j = 0;
        for (k = 0; k < numberOfElement; k++) {
            answer[i][j] = expandedArrary[k];
            j++;
            if (j == c){
                j = 0;
                i++;
            }

        }
        return answer;
    }
}