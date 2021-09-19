package medium;

public class IsSubStructure {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) {
            return false;
        }
        return A.val == B.val && help(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    private boolean help(TreeNode node, TreeNode b) {
        if (node == b || b == null) {
            return true;
        } else if (node == null) {
            return false;
        }
        return node.val == b.val && help(node.left, b.left) && help(node.right, b.right);
    }

    public static void main(String[] args) {


    }
}
