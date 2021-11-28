package `784`.` Letter Case Permutation`

import java.util.*

class Solution {
    fun letterCasePermutation(s: String): List<String> {
        val res = mutableListOf<String>()
        val que = LinkedList<Pair<String, Int>>()
        que.push(Pair(s, 0))
        while (que.isNotEmpty()) {
            val per = que.peek().first
            val index = que.peek().second
            que.pop()

            if (!res.contains(per)) res.add(per)

            for (i in index until per.length) {
                per[i].let {
                    if (it.isLetter()) {
                        val newChar = if (it.isUpperCase()) it.toLowerCase() else it.toUpperCase()
                        val new = StringBuilder(per).replace(i, i + 1, "$newChar").toString()
                        que.push(Pair(new, i + 1))
                    }
                }
            }
        }
        return res
    }
}