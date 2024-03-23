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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        
        ListNode prev = null;
        ListNode curr = slow;
        ListNode temp = null;
        while(curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        
        // 3단계: 재배열하기
        ListNode first = head, second = prev;
        while (first != null && second != null && first != second) {
            temp = first.next; // 다음 first 노드 저장
            first.next = second; // first 다음을 second로
            first = temp; // first 이동

            if (first != second) { // 여기서 first와 second가 같지 않은 경우에만 second를 이동
                temp = second.next; // 다음 second 노드 저장
                second.next = first; // second 다음을 first로
                second = temp; // second 이동
            }
        }

        if (first != null) first.next = null; // 순환 참조 방지
        
    }
}