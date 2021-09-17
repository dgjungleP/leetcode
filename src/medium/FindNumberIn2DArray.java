package medium;

public class FindNumberIn2DArray {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0 ||
                target < matrix[0][0] || target > matrix[matrix.length - 1][matrix[0].length - 1]) {
            return false;
        }
        int left = matrix[0].length;
        for (int[] top : matrix) {
            if (top[0] > target) {
                break;
            }
            for (int i = 0; i < left; i++) {
                int inner = top[i];
                if (inner > target) {
                    left = i;
                    break;
                } else if (inner == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        new FindNumberIn2DArray().findNumberIn2DArray(new int[][]{{-1, 3}}, 3);
    }
}
