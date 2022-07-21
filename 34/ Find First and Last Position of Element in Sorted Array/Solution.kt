package `34`.` Find First and Last Position of Element in Sorted Array`

class Solution {
    fun searchRange(nums: IntArray, target: Int): IntArray {

        if (nums.size == 0) return intArrayOf(-1, -1)

        var l: Int = 0
        var r: Int = nums.size - 1
        var mid = 0
        var res = IntArray(2)

        while (l < r) {
            mid = (l + r) / 2
            if (nums[mid] < target) {
                l = mid + 1
            } else {
                r = mid
            }
        }

        if (nums[l] != target) return intArrayOf(-1, -1)
        res[0] = l

        r = nums.size - 1

        while (l < r) {
            mid = (l + r) / 2 + 1
            if (nums[mid] == target) {
                l = mid
            } else {
                r = mid - 1
            }
        }
        res[1] = l
        return res
    }
}