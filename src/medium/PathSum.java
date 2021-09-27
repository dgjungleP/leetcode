package medium;

import java.util.ArrayList;
import java.util.List;

public class PathSum {

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

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        List<List<Integer>> result = new ArrayList<>();
        help(root, target, result, new ArrayList<>());
        return result;
    }

    private void help(TreeNode root, int target, List<List<Integer>> result, List<Integer> list) {
        if (root == null ) {
            return;
        }
        list.add(root.val);
        target = target - root.val;
        if (target == 0 && root.left == root.right && root.left == null) {
            result.add(list);
        } else {
            help(root.left, target, result, new ArrayList<>(list));
            help(root.right, target, result, new ArrayList<>(list));
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
        System.out.println("new PathSum().pathSum(node,22) = " + new PathSum().pathSum(node, 22));
    }
}
