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
    public ListNode middleNode(ListNode head) {
        ListNode first = head;
        ListNode second = head.next;
        if(second == null)
            return head;
        
        while(first != null && second != null) {
            first = first.next;
            second = second.next;
            if(second == null)
                return first;
            second = second.next;
        }
        
        return first;
    }
}