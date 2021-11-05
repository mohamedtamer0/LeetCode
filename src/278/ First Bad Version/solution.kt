package `278`.` First Bad Version`

class Solution: VersionControl() {
    override fun firstBadVersion(n: Int) : Int {
        if (n == 1) {
            return 1
        }
        var begin = 1
        var end = n
        while (begin < end) {
            val mid = begin + (end - begin) / 2
            if (isBadVersion(mid)) {
                end = mid
            } else if (!isBadVersion(mid) && isBadVersion(mid + 1)) {
                return mid + 1
            } else
                begin = mid + 1
        }

        if (begin!=n && isBadVersion(begin)) {
            return begin
        }
        return -1

    }
}