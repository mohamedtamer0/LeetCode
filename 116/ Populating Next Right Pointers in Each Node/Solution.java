class Solution {
    public Node connect(Node root) {
        dfs(root, null);
        return root;
    }

    void dfs(Node node, Node next) {
        if (node == null) return;
        if (node.left != null) {
            node.left.next = node.right;
        }
        if (node.right != null) {
            if (next != null) node.right.next = next.left;
        }
        dfs(node.left, node.right);
        dfs(node.right, next == null ? next : next.left);
    }
}