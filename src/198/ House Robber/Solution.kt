package `198`.` House Robber`

class Solution {
    var memo: MutableList<Int> = MutableList(0) { -1 }
    fun rob(nums: IntArray): Int {
        memo.addAll(MutableList(nums.size) { -1 })
        return tryRob(nums, 0)
    }

    private fun tryRob(nums: IntArray, index: Int): Int {
        if (index >= nums.size)
            return 0
        if (memo[index] != -1)
            return memo[index]

        var res = 0
        (index until nums.size).forEach {
            res = maxOf(res, nums[it] + tryRob(nums, it + 2))
        }
        memo[index] = res
        return res
    }
}