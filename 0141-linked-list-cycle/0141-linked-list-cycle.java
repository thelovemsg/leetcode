/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode first = head;
        if(first == null)
            return false;
        ListNode second = head.next;
        if(second == null)
            return false;
        
        if(first == second)
            return true;
        
        if(first.next == null)
            return false;
        
        if(second.next == null)
            return false;
        
        while(first != null && second != null) {
            first = first.next;
            if(first == null)
                return false;
            second = second.next;
            if(second == null)
                return false;
            second = second.next;
            
            if(second == null)
                return false;
            if(first == second)
                return true;
        }
        
        return false;
    }
}