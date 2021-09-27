package medium;

public class TreeToDoublyList {
    static class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }


    Node pre, head;

    public Node treeToDoublyList(Node root) {
        pre = null;
        head = null;
        if (root == null) return root;
        dfs(root);
        head.left = pre;
        pre.right = head;
        return head;
    }

    void dfs(Node root) {
        if (root == null) return; // 递归边界: 叶子结点返回
        dfs(root.left);
        if (pre != null) pre.right = root;
        else head = root; // 链表头结点
        root.left = pre;
        pre = root;
        dfs(root.right);
    }

    public static void main(String[] args) {
        Node node = new Node(4);
        node.left = new Node(2);
        node.left.left = new Node(1);
        node.left.right = new Node(3);
        node.right = new Node(5);

        System.out.println("new TreeToDoublyList().treeToDoublyList(node) = " + new TreeToDoublyList().treeToDoublyList(node));
    }
}
