package medium;

public class HasPathSum {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean pathSum(TreeNode root, int target) {
        return help(root, target);
    }

    private boolean help(TreeNode root, int target) {
        if (root == null) {
            return false;
        }
        target = target - root.val;
        if (target == 0 && root.left == root.right && root.left == null) {
            return true;
        } else {
            return help(root.left, target) || help(root.right, target);
        }
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(4);
        node.left.left = new TreeNode(11);
        node.left.left.left = new TreeNode(7);
        node.left.left.right = new TreeNode(2);
        node.right = new TreeNode(8);
        node.right.left = new TreeNode(13);
        node.right.right = new TreeNode(4);
        node.right.right.left = new TreeNode(5);
        node.right.right.right = new TreeNode(1);
        System.out.println("new PathSum().pathSum(node,22) = " + new HasPathSum().pathSum(node, 22));
    }
}
