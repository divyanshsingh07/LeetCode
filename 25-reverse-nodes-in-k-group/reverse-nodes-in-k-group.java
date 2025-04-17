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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        // Dummy node to simplify edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy, curr = dummy, next = dummy;

        // Count total nodes
        int count = 0;
        while (curr.next != null) {
            curr = curr.next;
            count++;
        }

        // Loop over groups
        while (count >= k) {
            curr = prev.next;
            next = curr.next;

            // Reverse k nodes
            for (int i = 1; i < k; i++) {
                curr.next = next.next;
                next.next = prev.next;
                prev.next = next;
                next = curr.next;
            }

            // Move to the next group
            prev = curr;
            count -= k;
        }

        return dummy.next;
        
    }
}