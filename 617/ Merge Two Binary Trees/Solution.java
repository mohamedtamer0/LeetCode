class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode node;
        if (t1 == null && t2 == null) {
            node = null;
        } else if (t1 == null) {
            node = new TreeNode(t2.val);
            node.left = mergeTrees(null, t2.left);
            node.right = mergeTrees(null, t2.right);
        } else if (t2 == null) {
            node = new TreeNode(t1.val);
            node.left = mergeTrees(t1.left, null);
            node.right = mergeTrees(t1.right, null);
        } else {
            node = new TreeNode(t1.val + t2.val);
            node.left = mergeTrees(t1.left, t2.left);
            node.right = mergeTrees(t1.right, t2.right);
        }
        return node;
    }
}