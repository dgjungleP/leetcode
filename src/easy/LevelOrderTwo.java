package easy;

import java.util.*;

public class LevelOrderTwo {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        queue.add(root);
        boolean reverse = false;
        while (!queue.isEmpty()) {
            help(queue, result, reverse);
            reverse = !reverse;
        }

        return result;
    }

    private void help(Queue<TreeNode> queue, List<List<Integer>> result, boolean reverse) {
        List<Integer> temp = new ArrayList<>();
        List<TreeNode> tempQueue = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            temp.add(node.val);
            if (node.left != null) {
                tempQueue.add(node.left);
            }
            if (node.right != null) {
                tempQueue.add(node.right);
            }
        }
        if (reverse) {
            Collections.reverse(temp);
        }
        queue.addAll(tempQueue);
        result.add(temp);
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        treeNode.right.right = new TreeNode(5);

        System.out.println("new LevelOrderTwo().levelOrder(treeNode) = " + new LevelOrderTwo().levelOrder(treeNode));

    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
