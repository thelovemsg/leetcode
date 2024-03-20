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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode head = list1;
        ListNode aNodePrev = null;
        ListNode bNodeNext = null;
        int idx = 0;
        while(list1 != null) {
            if(idx == a - 1){
                aNodePrev = list1;
            }
            
            if(idx == b) {
                bNodeNext = list1.next;
                break;
            }
            
            list1 = list1.next;
            idx++;
        }
        
        aNodePrev.next = list2;
        
        while(list2.next != null) {
            list2 = list2.next;
        }
        
        list2.next = bNodeNext;
        
        return head;
    }
}