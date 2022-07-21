package `33`.` Search in Rotated Sorted Array`

class Solution {
    fun search(nums: IntArray, target: Int): Int {
        if (nums.isEmpty()) {
            return -1
        }
        var left = 0
        var right = nums.size - 1
        while (left + 1 < right) {
            val mid = left + (right - left) / 2
            when {
                nums[mid] == target -> return mid
                nums[mid] >= nums[0] -> {
                    if (nums[left] <= target && target <= nums[mid]) {
                        right = mid
                    } else {
                        left = mid
                    }
                }

                nums[mid] <= nums[nums.size - 1] -> {
                    if (nums[mid] <= target && target <= nums[right]) {
                        left = mid
                    } else {
                        right = mid
                    }
                }
            }
        }
        return when (target) {
            nums[left] -> left
            nums[right] -> right
            else -> -1
        }
    }
}