package `1091`.` Shortest Path in Binary Matrix`

import java.util.*

class Solution {
    fun shortestPathBinaryMatrix(grid: Array<IntArray>): Int {
        val queue: Queue<IntArray> = LinkedList()
        val visited = Array(grid.size) { BooleanArray(grid[0].size) }

        if (grid[0][0] == 1) {
            return -1
        }
        queue.add(intArrayOf(0, 0))
        visited[0][0] = true

        var level = 1
        while (queue.isNotEmpty()) {
            for (size in queue.indices) {
                val current = queue.poll()
                if (current[0] == grid.size - 1 && current[1] == grid[0].size - 1) {
                    return level
                }
                for (index in 0..7) {
                    val nextX = current[0] + deltaX[index]
                    val nextY = current[1] + deltaY[index]
                    if (inBound(grid, nextX, nextY) && !visited[nextX][nextY] && grid[nextX][nextY] == 0) {
                        queue.offer(intArrayOf(nextX, nextY))
                        visited[nextX][nextY] = true
                    }
                }
            }
            ++level
        }
        return -1
    }

    private val deltaX = intArrayOf(0, 0, -1, 1, 1, 1, -1, -1)
    private val deltaY = intArrayOf(-1, 1, 0, 0, -1, 1, -1, 1)
    private fun inBound(
        grid: Array<IntArray>,
        x: Int,
        y: Int
    ) = x >= 0 && y >= 0 && x < grid.size && y < grid[0].size
}