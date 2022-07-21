class Solution {
public:
    int maxProfit(vector<int> &prices) {
        int max = 0, begin = 0, end = 0, delta = 0;

        for (int i = 0; i < prices.size(); i++) {
            end = i;
            delta = prices[end] - prices[begin];

            if (delta <= 0) {
                begin = i;
            }
            if (delta > max) {
                max = delta;
            }
        }
        return max;
    }
};