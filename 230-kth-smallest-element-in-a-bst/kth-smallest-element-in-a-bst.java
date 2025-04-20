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
    int c=0;
    int r=-1;
    public int kthSmallest(TreeNode root, int k) {  
        inOrder(root,k);
        return r;
    }
    private void inOrder(TreeNode node , int k){
        if(node==null) return;
        inOrder(node.left,k);
        c++;
        if(c==k){
            r=node.val;
            return;

        }
        inOrder(node.right,k);
    }
}