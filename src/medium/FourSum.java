package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return result;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                int pre = j + 1;
                int next = nums.length - 1;
                while (pre < next) {
                    int sum = nums[i] + nums[pre] + nums[next] + nums[j];
                    if (sum > target) {
                        next--;
                    } else if (sum < target) {
                        pre++;
                    } else {
                        List<Integer> inner = new ArrayList<>();
                        inner.add(nums[i]);
                        inner.add(nums[pre]);
                        inner.add(nums[next]);
                        inner.add(nums[j]);
                        result.add(inner);
                        while (j < nums.length - 1 && nums[j] == nums[j + 1]) {
                            j++;
                        }
                        pre = Math.max(j + 1, pre);
                        next--;
                        while (pre < next && nums[next] == nums[next + 1]) {
                            next--;
                        }
                    }
                }
                while (i < nums.length - 2 && nums[i] == nums[i + 1]) {
                    i++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        System.out.println("new FourSum().fourSum(new int[]{2, 2, 2, 2, 2},8) = " + new FourSum().fourSum(new int[]{2, 2, 2, 2, 2}, 8));
//        System.out.println("new FourSum().fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0) = " + new FourSum().fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0));
        System.out.println("new FourSum().fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0) = " + new FourSum().fourSum(new int[]{-2, -1, -1, 1, 1, 2, 2}, 0));
    }
}
