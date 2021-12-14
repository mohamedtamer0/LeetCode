package `74`.` Search a 2D Matrix`

class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        if (matrix.isNullOrEmpty() || matrix[0].isEmpty()) {
            return false
        }
        val targetRow = searchTargetRowIndex(matrix, target)
        if (targetRow == -1) {
            return false
        }

        return searchTargetIndex(matrix[targetRow], target) != -1
    }

    private fun searchTargetRowIndex(matrix: Array<IntArray>, target: Int): Int {
        var left = 0
        var right = matrix.size - 1

        while (left + 1 < right) {
            val mid = left + (right - left) / 2
            when {
                matrix[mid][0] <= target -> left = mid
                matrix[mid][0] > target -> right = mid
            }
        }

        return when {
            target >= matrix[right][0] -> right
            target >= matrix[left][0] -> left
            else -> -1
        }
    }


    private fun searchTargetIndex(nums: IntArray, target: Int): Int {
        if (nums.isEmpty()) {
            return -1
        }
        var left = 0
        var right = nums.size - 1
        while (left + 1 < right) {
            val mid = left + (right - left) / 2
            when {
                nums[mid] == target -> return mid
                nums[mid] < target -> left = mid
                nums[mid] > target -> right = mid
            }
        }
        return when (target) {
            nums[left] -> left
            nums[right] -> right
            else -> -1
        }
    }
}