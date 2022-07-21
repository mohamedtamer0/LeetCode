class Solution {
public:
    vector<int> sortedSquares(vector<int> &nums) {
        int sz = nums.size();
        vector<int> ans(sz);
        for (int l = 0, r = sz - 1, idx = sz - 1; l <= r; --idx) {
            if (-nums[l] < nums[r]) {
                ans[idx] = nums[r] * nums[r];
                --r;
            } else {
                ans [idx] = nums[l] * nums[l];
                ++l;
            }
        }
        return ans;
    }
};