package easy;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        int left = 0;
        int right = nums.length;
        int mid;
        while (left < right) {
            mid = (left + right) / 2;
            if (nums[mid] > mid) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0};
        System.out.println("new MissingNumber().missingNumber() = " + new MissingNumber().missingNumber(nums));

    }
}
