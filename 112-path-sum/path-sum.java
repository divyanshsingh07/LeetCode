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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        return helper(root, targetSum, 0);
    }
    private boolean helper(TreeNode root, int targetsum, int currentsum){
        if(root == null){
            return false;
        }
        if(root.left == null && root.right == null){
            if(currentsum + root.val == targetsum){
                return true;
            }
            return false;
        }
        return helper(root.left, targetsum, currentsum + root.val) || helper(root.right, targetsum, currentsum + root.val);
    }
}