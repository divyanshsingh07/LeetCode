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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            double sum = 0;
            for(int i=0;i<n;i++){
                TreeNode node =q.remove();
                sum+=node.val;
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            double avg=sum/n;
            res.add(avg);
        }
        return res;   
    }
}