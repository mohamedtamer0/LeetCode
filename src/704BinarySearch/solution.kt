package `704BinarySearch`

class Solution {
    fun search(nums: IntArray, target: Int): Int {
        val index = -1
        var begin = 0
        var end = nums.size - 1
        var middle = (end + begin) / 2
        while (begin <= end) {
            if (nums[middle] == target) return middle
            if (nums[middle] > target) {
                end = middle - 1
                middle = (end + begin) / 2
            }
            if (nums[middle] < target) {
                begin = middle + 1
                middle = (end + begin) / 2
            }
        }
        return index
    }
}