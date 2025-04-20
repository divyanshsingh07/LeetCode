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
        List<Integer> values = new ArrayList<>();

        // Step 1: Copy linked list to array
        while (head != null) {
            values.add(head.val);
            head = head.next;
        }

        // Step 2: Convert array to BST
        return buildBST(values, 0, values.size() - 1);
    }

    private TreeNode buildBST(List<Integer> values, int left, int right) {
        if (left > right) return null;

        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(values.get(mid));

        node.left = buildBST(values, left, mid - 1);
        node.right = buildBST(values, mid + 1, right);

        return node;
    }
}