class Solution {
public:
    vector<int> intersect(vector<int> &nums1, vector<int> &nums2) {
        sort(nums1.begin(), nums1.end());
        sort(nums2.begin(), nums2.end());
        vector<int> solution;
        int index = 0;
        bool finished = false;
        for (int i = 0; i < nums1.size() && !finished; i++) {
            while (index < nums2.size() && nums1[i] > nums2[index]) {
                index++;
            }
            if (index == nums2.size()) {
                finished = true;
            } else if (nums1[i] == nums2[index]) {
                solution.push_back(nums1[i]);
                index++;
            }
        }
        return solution;
    }
};