class Solution {
    public void moveZeroes(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (k != 0) {
                    nums[i - k] = nums[i];
                    nums[i] = 0;
                }
            } else {
                k++;
            }
        }
    }
}