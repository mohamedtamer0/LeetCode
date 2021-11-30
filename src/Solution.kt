class Solution {
    fun singleNumber(nums: IntArray): Int {
        var res = 0
        (0 until nums.size).forEach {
            res = res xor nums[it]
        }
        return res
    }
}