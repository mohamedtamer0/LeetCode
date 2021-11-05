package `704BinarySearch`

internal class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var lo = 0
        var hi = nums.size - 1
        while (lo <= hi) {
            val mid = lo + (hi - lo) / 2
            if (nums[mid] == target) {
                return mid
            }
            if (nums[mid] > target) {
                hi = mid - 1
            } else {
                lo = mid + 1
            }
        }
        return -1
    }
}