class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode fakeHead = new ListNode();
        ListNode writer = fakeHead;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                writer.next = l1;
                l1 = l1.next;
            } else {
                writer.next = l2;
                l2 = l2.next;
            }
            writer = writer.next;
        }
        if (l1 != null) {
            writer.next = l1;
        }
        if (l2 != null) {
            writer.next = l2;
        }

        ListNode res = fakeHead.next;
        fakeHead.next = null;
        return res;

    }
}