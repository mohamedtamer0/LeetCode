package `231`.` Power of Two`

class Solution {
    fun isPowerOfTwo(n: Int): Boolean {
        return n > 0 && (n and n - 1 == 0)
    }
}