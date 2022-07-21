
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res = 0;
        int t;
        while ((t = n & (-n)) != 0) {
            res++;
            n -= t;
        }
        return res;
    }
}