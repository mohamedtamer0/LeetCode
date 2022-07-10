class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var res =0
        for (i in 0 until nums.size) {
            if(nums[i] != `val`) {
                nums[res++] = nums[i]
            }
        }
        return res
    }
}