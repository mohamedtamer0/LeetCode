public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res = 0;
        int t = 31;
        while (t >= 0) {
            int i = n & 1;
            res += i << t;
            n = n >> 1;
            t--;
        }
        return res;
    }
}