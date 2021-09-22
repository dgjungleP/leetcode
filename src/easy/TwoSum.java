package easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> resultMap = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            Integer preIndex = resultMap.get(target - nums[i]);
            if (preIndex != null) {
                result[0] = preIndex;
                result[1] = i;
                break;
            }
            resultMap.put(nums[i], i);
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
