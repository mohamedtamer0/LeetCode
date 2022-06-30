class Solution {
    public int minMoves2(int[] nums) {
        int res = 0;
        if (nums == null || nums.length <= 1) return res;
        int start = 0;
        int end = nums.length -1 ;
        Arrays.sort(nums);
        while(start < end) {
            res += nums[end] - nums[start];
            start++;
            end--;
        }
        return res;
    }
}