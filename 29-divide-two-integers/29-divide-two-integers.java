class Solution {
    public int divide(int dividend, int divisor) {
        //check if negative answer
        boolean isNeg = (dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0);
        
        //use long to take care of overflow
        long ldividend = Math.abs((long)dividend);
        long ldivisor = Math.abs((long)divisor);
        
        long res = 0, curr = 1;
        long sub = ldivisor;
        
        while (ldividend >= ldivisor) {
            if (ldividend >= sub) {
                res += curr;
                ldividend -= sub;
                sub = sub << 1; //sub = sub * 2
                curr = curr << 1; //curr = curr * 2
            }
            else {
                sub = sub >> 1;
                curr = curr >> 1;
            }
        }
        
        res = isNeg ? -res : res;
        
        return (int) (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE ? Integer.MAX_VALUE : res);
    }
}