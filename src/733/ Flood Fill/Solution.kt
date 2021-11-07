package `733`.` Flood Fill`

class Solution {
    val direct = arrayOf(intArrayOf(1, 0), intArrayOf(0, 1), intArrayOf(-1, 0), intArrayOf(0, -1))
    fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, newColor: Int): Array<IntArray> {
        if (image[sr][sc] == newColor) return image
        dfs(image, sr, sc, image[sr][sc], newColor)
        return image
    }

    private fun dfs(image: Array<IntArray>, sr: Int, sc: Int, srcColor: Int, newColor: Int) {
        image[sr][sc] = newColor
        (0 until 4).forEach { i ->
            val newX = sr + direct[i][0]
            val newY = sc + direct[i][1]
            if (newX in (0 until image.size) && newY in (0 until image[0].size)
                && image[newX][newY] == srcColor
            ) {
                floodFill(image, newX, newY, newColor)
            }
        }
    }
}