package `572`.` Subtree of Another Tree`


var ti = TreeNode(5)
var v = ti.`val`

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {
        if (null == root || null == subRoot) return root == subRoot
        return isSame(root, subRoot) || isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot)
    }

    private fun isSame(node: TreeNode?, t: TreeNode?): Boolean {
        if (node == null || t == null) return node == t
        return node.`val` == t.`val` && isSame(node.left, t.left) && isSame(node.right, t.right)
    }
}