class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2)
            return 0;

        int answer = 0;
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (min < prices[i])
                answer = Math.max(answer, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        return answer;
    }
}