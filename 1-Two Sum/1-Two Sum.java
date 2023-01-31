class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> complement = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];

            if (complement.containsKey(temp))
                return new int[] {complement.get(temp), i};

            complement.put(nums[i],i);
        }
        return null;
    }
}