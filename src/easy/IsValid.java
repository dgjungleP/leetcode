package easy;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class IsValid {
    public static final List<Character> LEFT = Arrays.asList('(', '{', '[');
    public static final List<Character> RIGHT = Arrays.asList(')', '}', ']');

    public boolean isValid(String s) {
        char[] array = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : array) {
            if (LEFT.contains(c)) {
                stack.push(c);
            } else if (RIGHT.contains(c)) {
                if (stack.isEmpty()) {
                    return false;
                }
                Character pop = stack.pop();
                if ((c == ')' && pop != '(') || (c == '}' && pop != '{') || (c == ']' && pop != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {

    }
}
