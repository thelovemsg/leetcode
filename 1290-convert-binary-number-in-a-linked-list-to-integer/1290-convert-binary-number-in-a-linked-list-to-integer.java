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
    public int getDecimalValue(ListNode head) {
        String result = "";
        while(head!=null){
            result += String.valueOf(head.val);
            head = head.next;
        }
        int cal = 0;
        for(int i=0; i<result.length(); i++){
            if(result.charAt(i) != '0'){
                cal += (int) Math.pow(2,result.length()-i-1);
            }
        }
        return cal;
    }
}