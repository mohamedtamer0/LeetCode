package `344`.` Reverse String`

class Solution {
    private fun swap(s: CharArray, left: Int, right: Int) {
        var temp = s[left]
        s[left] = s[right]
        s[right] = temp
    }

    fun reverseString(s: CharArray): Unit {
        var left = 0
        var right = s.size - 1

        while (left < right) {
            swap(s, left, right)

            left++
            right--
        }
    }
}