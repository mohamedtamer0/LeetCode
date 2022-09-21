/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode first = head, second = first.next;
        while(second != null) {
            if(first.val == second.val) {
                second=second.next;
                first.next = second;
            }else{
                first  = second;
                second = second.next;
            }
        }
        return head;
    }
}