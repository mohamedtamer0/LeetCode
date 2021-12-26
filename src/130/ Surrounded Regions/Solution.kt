package `130`.` Surrounded Regions`


class Solution {
    fun solve(board: Array<CharArray>): Unit {
        if (board.isEmpty()) return
        val row = board.size
        val col = board[0].size
        for (i in (0 until row)) {
            check(board, i, 0)
            check(board, i, col - 1)
        }

        for (i in (1 until col - 1)) {
            check(board, 0, i)
            check(board, row - 1, i)
        }

        for (i in 0 until row) {
            for (j in 0 until col) {
                if (board[i][j] == '#') board[i][j] = 'O'
                else board[i][j] = 'X'
            }
        }

    }

    private val direct = arrayOf(intArrayOf(1, 0), intArrayOf(0, 1), intArrayOf(-1, 0), intArrayOf(0, -1))
    private fun check(board: Array<CharArray>, i: Int, j: Int) {
        if (board[i][j] == 'O') {
            board[i][j] = '#'
            for (d in direct) {
                val x = i + d[0]
                val y = j + d[1]
                if (x in 0..board.lastIndex && y in 0..board[0].lastIndex)
                    check(board, x, y)
            }
        }
    }
}