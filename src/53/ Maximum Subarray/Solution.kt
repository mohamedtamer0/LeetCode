package `53`.` Maximum Subarray`

class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var sum = 0
        var maxa = -2147483647

        nums.forEach { a ->
            if (sum < 0) {
                sum = a
            } else {
                sum += a
            }
            maxa = Math.max(sum, maxa)
        }
        return maxa
    }
}