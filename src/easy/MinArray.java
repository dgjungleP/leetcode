package easy;

public class MinArray {
    public int minArray(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (numbers[mid] > numbers[right]) {
                left = mid + 1;
            } else if (numbers[mid] == numbers[right]) {
                right--;
            } else {
                right = mid;
            }
        }
        return numbers[left];
    }

    public static void main(String[] args) {
        System.out.println("new MinArray().minArray() = " + new MinArray().minArray(new int[]{3, 4, 5, 1, 2}));
        System.out.println("new MinArray().minArray() = " + new MinArray().minArray(new int[]{3, 3, 1, 3}));
        System.out.println("new MinArray().minArray() = " + new MinArray().minArray(new int[]{1, 3, 3}));
    }
}
