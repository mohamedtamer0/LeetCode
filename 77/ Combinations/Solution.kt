package `77`.` Combinations`

class Solution {
    private val res = ArrayList<List<Int>>()
    fun combine(n: Int, k: Int): List<List<Int>> {
        if (n < 1 || k < 1 || n < k) return res
        combination(n, k, 1, ArrayList<Int>())
        return res
    }

    private fun combination(n: Int, k: Int, start: Int, list: ArrayList<Int>) {
        if (list.size == k) res.add(ArrayList(list))
        else (start..n).forEach {
            list.add(it)
            combination(n, k, it + 1, list)
            list.remove(it)
        }
    }
}