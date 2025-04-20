class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if (root == null) return list;
        helper(root, list, new StringBuilder());
        return list;
    }

    private void helper(TreeNode node, List<String> list, StringBuilder path) {
        if (node == null) return;

        int len = path.length(); // Save length before appending
        path.append(node.val);

        if (node.left == null && node.right == null) {
            list.add(path.toString()); // Leaf node, save path
        } else {
            path.append("->");
            helper(node.left, list, path);
            helper(node.right, list, path);
        }

        path.setLength(len); // Backtrack to previous state
    }
}