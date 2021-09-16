package easy;


public class Search {

    public int search(int[] nums, int target) {
        int pre = 0;
        int end = 0;

        boolean find = false;
        if (nums.length == 0) {
            return 0;
        }
        while (end < nums.length) {
            if (nums[end] != target) {
                if (find) {
                    break;
                }
                pre = end+1;

            } else {
                find = true;
            }
            end++;
        }
        return end - pre ;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5,7,7,8,8,10};
        System.out.println("new Search().search(nums, 8) = " + new Search().search(nums, 8));
    }
}
