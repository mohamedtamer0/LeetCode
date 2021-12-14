package `162`.` Find Peak Element`

class Solution {
    fun findPeakElement(nums: IntArray): Int {
        var left = 0
        var right = nums.size - 1

        while (left + 1 < right) {
            val mid = left + (right - left) / 2
            when {
                nums[mid - 1] < nums[mid] && nums[mid] > nums[mid + 1] -> return mid
                nums[mid - 1] < nums[mid] -> left = mid
                else -> right = mid
            }
        }

        return when {
            nums[left] > nums[right] -> left
            else -> right
        }
    }
}