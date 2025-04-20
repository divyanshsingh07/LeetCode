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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return new TreeNode(head.val);

        // Find the middle node
        ListNode mid = findMiddle(head);

        TreeNode root = new TreeNode(mid.val);

        // Recursively build left and right subtrees
        root.left = sortedListToBST(head == mid ? null : head); // Left list before mid
        root.right = sortedListToBST(mid.next); // Right list after mid

        return root;
    }

    // Helper to find the middle of the linked list
    private ListNode findMiddle(ListNode head) {
        ListNode prev = null, slow = head, fast = head;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Disconnect the left half from mid
        if (prev != null) {
            prev.next = null;
        }

        return slow;
    }
}