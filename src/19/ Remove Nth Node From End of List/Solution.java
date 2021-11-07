class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode front = head;
        for (int i = 0; i < n; ++i) {
            front = front.next;
        }

        if (front == null) {
            ListNode res = head.next;
            head.next = null;
            return res;
        }

        ListNode back = head;
        while (front.next != null) {
            front = front.next;
            back = back.next;
        }


        ListNode removal = back.next;
        back.next = removal.next;
        removal.next = null;
        return head;
    }
}