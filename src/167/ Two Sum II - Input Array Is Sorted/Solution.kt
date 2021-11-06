package `167`.` Two Sum II - Input Array Is Sorted`

class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {

        numbers.forEachIndexed { i, num ->
            val v = numbers.binarySearch(target - num, i + 1)
            if (v > 0) {
                return intArrayOf(i + 1, v + 1)
            }
        }
        return intArrayOf()
    }
}