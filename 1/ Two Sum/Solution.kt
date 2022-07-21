package `1`.` Two Sum`

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val numMap = HashMap<Int, Int>()
        for (n in nums.withIndex()) {
            val comp = target - n.value
            if (numMap.containsKey(comp))
                return intArrayOf(numMap[comp]!!, n.index)
            numMap.put(n.value, n.index)
        }
        return intArrayOf()
    }
}