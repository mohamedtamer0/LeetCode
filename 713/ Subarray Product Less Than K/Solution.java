

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            long t = 1;
            for (int j = i; j < n; j++) {
                t *= nums[j];
                if (t < k) {
                    res++;
                }else break;
            }
        }
        return res;
    }
}