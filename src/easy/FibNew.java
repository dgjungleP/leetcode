package easy;

public class FibNew {
    public static final int MOD = 1000000007;

    public int fib(int n) {
        int pre = 0;
        int next = 1;
        int result = 1;
        if (n == 0) {
            return 0;
        }
        for (int i = 1; i < n; i++) {
            result = (pre + next) % MOD;
            pre = next % MOD;
            next = result % MOD;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println("new FibNew().Fib(0) = " + new FibNew().fib(0));
        System.out.println("new FibNew().Fib(0) = " + new FibNew().fib(1));
        System.out.println("new FibNew().Fib(0) = " + new FibNew().fib(2));
        System.out.println("new FibNew().Fib(0) = " + new FibNew().fib(3));
        System.out.println("new FibNew().Fib(0) = " + new FibNew().fib(4));
        System.out.println("new FibNew().Fib(0) = " + new FibNew().fib(5));
        System.out.println("new FibNew().Fib(0) = " + new FibNew().fib(6));
        System.out.println("new FibNew().Fib(0) = " + new FibNew().fib(7));
    }
}
