package `120`.` Triangle`

class Solution {
    fun minimumTotal(triangle: List<List<Int>>): Int {
        val tri = triangle as List<MutableList<Int>>
        (tri.lastIndex - 1 downTo 0).forEach { i ->
            (0 until tri[i].size).forEach { j ->
                tri[i][j] += minOf(tri[i + 1][j], tri[i + 1][j + 1])
            }
        }

        return tri[0][0]
    }
}