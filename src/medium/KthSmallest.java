package medium;

public class KthSmallest {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static int count, result;

    public int kthSmallest(TreeNode root, int k) {
        count = k;
        help(root);
        return result;
    }

    private void help(TreeNode root) {
        if (root == null) {

            return;
        }
        help(root.left);
        if (count-- == 0) {
            return;
        }
        if (count == 0) {
            result = root.val;
            return;
        }
        help(root.right);
    }
}
