package easy;

public class KthLargest {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private int count = 0, res = 0;

    public int kthLargest(TreeNode root, int k) {
        this.count = k;
        help(root);
        return res;
    }

    private void help(TreeNode root) {
        if (root == null) {
            return;
        }
        help(root.right);
        if (count == 0) {
            return;
        }
        if (--count == 0) {
            res = root.val;
            return;
        }
        help(root.left);
    }


    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(1);
        treeNode.left.right = new TreeNode(2);
        treeNode.right = new TreeNode(4);

        System.out.println("new KthLargest().kthLargest(treeNode) = " + new KthLargest().kthLargest(treeNode, 1));
    }
}
