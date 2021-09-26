package medium;

public class MovingCount {

    public int movingCount(int m, int n, int k) {
        return help(new boolean[m][n], m, n, 0, 0, k);
    }

    private int help(boolean[][] tags, int m, int n, int i, int j, int k) {
        if (i < 0 || i >= m || j < 0 || j >= n || tags[i][j] || getSum(i, j) > k) {
            return 0;
        }
        tags[i][j] = true;
        return help(tags, m, n, i - 1, j, k) + help(tags, m, n, i, j - 1, k) + help(tags, m, n, i + 1, j, k) + help(tags, m, n, i, j + 1, k) + 1;
    }

    private int getSum(int i, int j) {
        return getSum(i) + getSum(j);
    }

    private int getSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("new MovingCount().movingCount(2,3,1) = " + new MovingCount().movingCount(2, 3, 1));
        System.out.println("new MovingCount().movingCount(3,1,0) = " + new MovingCount().movingCount(3, 1, 0));
    }
}
