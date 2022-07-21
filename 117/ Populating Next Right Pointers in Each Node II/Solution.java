import java.util.HashMap;
import java.util.Map;

class Solution {
    Map<Integer, Node> map = new HashMap<>();

    public Node connect(Node root) {
        hepler(root, 0);
        return root;
    }

    void hepler(Node node, int deepth) {
        if (node == null) return;
        if (map.containsKey(deepth)) {
            map.get(deepth).next = node;
        }
        map.put(deepth, node);
        hepler(node.left, deepth + 1);
        hepler(node.right, deepth + 1);
    }
}


class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}