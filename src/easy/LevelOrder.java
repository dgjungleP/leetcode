package easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            help(queue, result);
        }

        return result;
    }

    private void help(Queue<TreeNode> queue, List<List<Integer>> result) {
        List<Integer> temp = new ArrayList<>();
        Queue<TreeNode> tempQueue = new LinkedList<>();
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
        queue.addAll(tempQueue);
        result.add(temp);
    }

    public static void main(String[] args) {

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
