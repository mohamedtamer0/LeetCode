fun search(nums: IntArray, target: Int): Int {
    var begin = 0
    var end = nums.size - 1
    var middle = (end + begin) / 2

    while (begin <= end) {
        middle = (end + begin) / 2
        if (nums[middle] == target) return middle
        else if (nums[middle] < target) {
            begin = middle + 1
        } else {
            end = middle - 1

        }
    }
    return begin
}