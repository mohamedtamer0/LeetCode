package `206`.` Reverse Linked List`

class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        var p = head
        var q = head?.next
        var h = head
        h?.next = null
        while (q != null) {
            p = q
            q = q.next
            p.next = h
            h = p
        }
        return h
    }
}
