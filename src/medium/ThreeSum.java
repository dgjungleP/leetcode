package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return result;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            int pre = i + 1;
            int next = nums.length - 1;
            while (pre < next) {
                int sum = nums[i] + nums[pre] + nums[next];
                if (sum > 0) {
                    next--;
                } else if (sum < 0) {
                    pre++;
                } else {
                    List<Integer> inner = new ArrayList<>();
                    inner.add(nums[i]);
                    inner.add(nums[pre]);
                    inner.add(nums[next]);
                    result.add(inner);
                    while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                        i++;
                    }
                    pre = i + 1;
                    next--;
                    while (pre < next && nums[next] == nums[next + 1]) {
                        next--;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("new ThreeSum().threeSum(new int[]{-1,0,1,2,-1,-4}) = " + new ThreeSum().threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println("new ThreeSum().threeSum(new int[]{-1,0,1,2,-1,-4}) = " + new ThreeSum().threeSum(new int[]{-1, 0, 0, 0, 0, 1, 1, 1, 1}));
    }
}
