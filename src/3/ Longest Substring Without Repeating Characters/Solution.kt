package `3`.` Longest Substring Without Repeating Characters`

/////old version .toInt()
class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val freq = IntArray(256) { 0 }
        var l = 0
        var r = -1
        var res = 0
        while (l < s.length) {
            if (r + 1 < s.length && freq[s[r + 1].toInt()] == 0) freq[s[++r].toInt()]++
            else freq[s[l++].toInt()]--

            res = maxOf(res, r - l + 1)
        }
        return res
    }
}


////////////// For Kotlin 1.5 new version
//class Solution {
//    fun lengthOfLongestSubstring(s: String): Int {
//        val freq = IntArray(256) { 0 }
//        var l = 0
//        var r = -1
//        var res = 0
//        while (l < s.length) {
//            if (r + 1 < s.length && freq[s[r + 1].code] == 0) freq[s[++r].code]++
//            else freq[s[l++].code]--
//
//            res = maxOf(res, r - l + 1)
//        }
//        return res
//    }
//}
