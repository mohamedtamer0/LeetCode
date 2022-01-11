package `217`.` Contains Duplicate`

class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        return nums.toHashSet().size < nums.size
    }
}