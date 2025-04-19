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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> l=new ArrayList<>();
        if(root==null) return l;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        boolean b=false;
        while(!q.isEmpty()){
            int len=q.size();
            List<Integer> r=new ArrayList<>();
            for(int i=0;i<len;i++){
                TreeNode c=q.poll();
                r.add(c.val);
                if(c.left!=null) q.offer(c.left);
                if(c.right!=null)q.offer(c.right);
            }
            if(b){
                Collections.reverse(r);
            }
            l.add(r);
            b=!b;
            
        }
        return l;
        
    }
}