package easy;

public class TwoSumTwo {

    public int[] twoSum(int[] numbers, int target) {
        int pre = 1;
        int next = numbers.length;
        while (pre < next) {
            int count = numbers[pre - 1] + numbers[next - 1];
            if (count > target) {
                next--;
            } else if (count < target) {
                pre++;
            } else {
                break;
            }
        }
        return new int[]{pre, next};
    }

    public static void main(String[] args) {
        new TwoSumTwo().twoSum(new int[]{5, 25, 75}, 100);
    }
}
