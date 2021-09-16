package easy;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.REUtil;

import java.util.Arrays;

public class FIndRepeatNumber {

    public int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{2, 3, 1, 0, 2, 5, 3};
        System.out.println("new FIndRepeatNumber().findRepeatNumber() = " + new FIndRepeatNumber().findRepeatNumber(numbers));
    }
}
