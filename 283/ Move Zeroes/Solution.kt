package `283`.` Move Zeroes`

class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var zeroes = 0
        nums.indices.forEach {
            when (nums[it]) {
                0 -> zeroes++
                else -> {
                    if (zeroes != 0) {
                        nums[it - zeroes] = nums[it]
                        nums[it] = 0
                    }
                }
            }
        }
    }
}