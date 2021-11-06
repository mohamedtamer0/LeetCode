class Solution {
public:
    void rotate(vector<int> &nums, int k) {
        int sz = nums.size();
        int step = k % sz;
        for (int i = 0; i < (sz - step) / 2; ++i) {
            swap(nums[i], nums[sz - step - 1 - i]);
        }
        for (int i = 0; i < step / 2; ++i) {
            swap(nums[sz - step + i], nums[sz - 1 - i]);
        }
        for (int i = 0; i < sz / 2; ++i) {
            swap(nums[i], nums[sz - 1 - i]);
        }
    }
};