package `438`.` Find All Anagrams in a String`

class Solution {
    fun findAnagrams(s: String, p: String): List<Int> {
        if (s.isEmpty() || s.length < p.length) {
            return emptyList()
        }

        val result = mutableListOf<Int>()
        val hashArray = IntArray(26)
        for (index in p.indices) {
            ++hashArray[p[index] - 'a']
        }

        var left = 0
        var count = 0

        for (index in s.indices) {
            if (--hashArray[s[index] - 'a'] >= 0) {
                ++count
            }
            if (index >= p.length) {
                if (hashArray[s[left++] - 'a']++ >= 0) {
                    --count
                }
            }
            if (count == p.length) {
                result.add(left)
            }
        }
        return result
    }
}