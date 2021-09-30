package easy;

public class IsBalanced {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isBalanced(root.left) && isBalanced(root.right) && Math.abs(help(root.left) - help(root.right)) < 2;
    }

    private int help(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(help(root.left), help(root.right)) + 1;
    }
}
