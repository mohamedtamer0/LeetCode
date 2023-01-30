class Solution {
    public int maxSubArray(int[] nums) {
        int total = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            if (max < total)
                max = total;
            if (total <= 0)
                total = 0;
        }
        return max;
    }
}