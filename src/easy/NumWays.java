package easy;

import java.util.HashMap;
import java.util.Map;

public class NumWays {
    public static final Map<Integer, Integer> cache = new HashMap<>();

    private int numWays(int n) {
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
            result = numWays(n);
            cache.put(n, result);
        }
        if (result > 1000000007) {
            result = result % 1000000007;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
