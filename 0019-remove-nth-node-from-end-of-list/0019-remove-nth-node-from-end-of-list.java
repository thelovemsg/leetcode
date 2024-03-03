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
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0); // 더미 노드 생성
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        // Fast 포인터를 n+1만큼 이동시켜 놓음
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Fast가 리스트의 끝에 도달할 때까지 Fast와 Slow를 함께 이동
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Slow의 다음 노드를 삭제
        slow.next = slow.next.next;

        return dummy.next; // 더미 노드의 다음 노드 반환
    }
}