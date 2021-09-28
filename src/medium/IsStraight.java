package medium;

import java.util.Arrays;

public class IsStraight {

    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int min = 14;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                continue;
            }
            if (nums[i] == nums[i + 1]) {
                return false;
            }
            min = Math.min(min, nums[i]);
        }
        return nums[nums.length - 1] - min < 5;
    }

    public static void main(String[] args) {
        System.out.println("new IsStraight().isStraight(new int[]{0, 0, 2, 2, 5}) = " + new IsStraight().isStraight(new int[]{0, 0, 2, 2, 5}));

    }
}
