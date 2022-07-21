package `70`.` Climbing Stairs`

class Solution {
    fun climbStairs(n: Int): Int {
        val arr = MutableList(n + 2) { 0 }
        arr[1] = 1
        arr[2] = 2
        return (3..n).forEach { arr[it] = arr[it - 1] + arr[it - 2] }.let { arr[n] }
    }

}