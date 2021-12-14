package `153`.` Find Minimum in Rotated Sorted Array`

class Solution {
    fun findMin(nums: IntArray): Int {
        var left = 0
        var right = nums.size - 1

        while (left + 1 < right) {
            val mid = left + (right - left) / 2
            when {
                nums[mid] >= nums[0] -> {
                    if (nums[mid] < nums[right]) {
                        return nums[0]
                    } else {
                        left = mid
                    }
                }

                nums[mid] <= nums[right] -> {
                    right = mid
                }
            }
        }
        return minOf(nums[left], nums[right])
    }
}