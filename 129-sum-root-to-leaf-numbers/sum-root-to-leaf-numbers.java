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
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode node, int currentSum) {
        if (node == null) return 0;

        // Form the number along the path
        currentSum = currentSum * 10 + node.val;

        // If it's a leaf, return the current number
        if (node.left == null && node.right == null) {
            return currentSum;
        }

        // Recurse for left and right subtrees
        int left = dfs(node.left, currentSum);
        int right = dfs(node.right, currentSum);

        return left + right;
    }
        
    
}