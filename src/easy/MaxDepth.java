package easy;

public class MaxDepth {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int maxDepth(TreeNode root) {
        return help(root, 0);
    }

    private int help(TreeNode root, int i) {
        if (root == null) {
            return i;
        }
        i++;
        return Math.max(help(root.left, i), help(root.right, i));
    }
}
