package easy;

import java.util.HashMap;
import java.util.Map;

public class Fib {
    public static final Map<Integer, Integer> cache = new HashMap<>();

    private int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int pre = getWithCache(n - 1);
        int next = getWithCache(n - 2);
        int result = pre + next;
        if (result > 1000000007) {
            result = result % 1000000007;
        }
        return result;
    }

    private int getWithCache(int n) {
        int result;
        if (cache.containsKey(n)) {
            result = cache.get(n);
        } else {
            result = fib(n);
            cache.put(n, result);
        }
        if (result > 1000000007) {
            result = result % 1000000007;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println("new Fib().fib(10) = " + new Fib().fib(41));
    }
}
