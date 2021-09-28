package medium;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MinNumber {

    public String minNumber(int[] nums) {
        List<String> collect = Arrays.stream(nums).mapToObj(String::valueOf).collect(Collectors.toList());
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (help(collect.get(i), collect.get(j))) {
                    String temp = collect.get(i);
                    collect.set(i, collect.get(j));
                    collect.set(j, temp);
                }
            }
        }
        return String.join("", collect);
    }

    private boolean help(String num, String num1) {
        String pre = num + num1;
        String next = num1 + num;
        return pre.compareTo(next) > 0;
    }

    public static void main(String[] args) {
        System.out.println("new MinNumber().minNumber(new int[]{3,30,34,5,9}) = " + new MinNumber().minNumber(new int[]{3, 30, 34, 5, 9}));
    }
}
