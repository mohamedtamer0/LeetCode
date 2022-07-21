package `209`.` Minimum Size Subarray Sum`

class Solution {
    fun minSubArrayLen(s: Int, nums: IntArray): Int {
        var l = 0
        var r = -1
        var sum = 0
        var res = nums.size + 1

        while (l < nums.size) {
            if (r + 1 < nums.size && sum < s) sum += nums[++r]
            else sum -= nums[l++]

            if (sum >= s) res = minOf(r - l + 1, res)
        }
        return if (res != nums.size + 1) res else 0
    }
}