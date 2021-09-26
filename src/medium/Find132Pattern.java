package medium;

import java.util.Stack;

public class Find132Pattern {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int k = Integer.MIN_VALUE;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < k) {
                return true;
            }
            while (!stack.isEmpty() && stack.peek() < nums[i]) {
                k = stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("new Find132Pattern().find132pattern(new int[]{1, 3, 2, 4, 5, 6, 7, 8, 9, 10}) = " + new Find132Pattern().find132pattern(new int[]{1, 3, 2, 4, 5, 6, 7, 8, 9, 10}));
    }
}
