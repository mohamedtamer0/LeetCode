package `15`.` 3Sum`

class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        nums.sort()
        val res = mutableListOf<List<Int>>()
        var x: Int
        var y: Int
        for (i in 0 until nums.size - 2) {
            if (i > 0 && nums[i] == nums[i - 1]) continue
            x = i + 1
            y = nums.size - 1

            while (x < y) {
                val temp = nums[x] + nums[y] + nums[i]
                if (temp == 0) {
                    res.add(listOf(nums[i], nums[x], nums[y]))

                    while (x < y && nums[x] == nums[x + 1]) x++
                    while (x < y && nums[y] == nums[y - 1]) y--
                    x++
                    y--
                } else if (temp > 0) {
                    y--
                } else {
                    x++
                }
            }
        }
        return res
    }
}