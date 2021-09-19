package easy;

public class MirrorTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode result = new TreeNode(root.val);
        result.left = mirrorTree(root.right);
        result.right = mirrorTree(root.left);
        return result;

    }

    public static void main(String[] args) {

    }
}
