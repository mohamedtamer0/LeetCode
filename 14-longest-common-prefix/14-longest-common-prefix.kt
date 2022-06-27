class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.size == 0) return ""
        var len = 0
        var res = ""
        for (j in 0 until strs[0].length) {
            val c = strs[0][j]
            for (i in 1 until strs.size) {
                if (j >= strs[i].length || strs[i][j] != c) {
                    return res
                }
            }
            res += c
        }
        return res
    }
}