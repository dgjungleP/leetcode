package easy;

public class MaxSubArray {

    public int maxSubArray(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] = Math.max(nums[i], nums[i] + nums[i - 1]);
            result = Math.max(result, nums[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("new MaxSubArray().maxSubArray(new int[]{}) = " + new MaxSubArray().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
