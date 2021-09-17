package easy;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqChar {
    public char firstUniqChar(String s) {
        if (s.length() == 0) {
            return ' ';
        }

        char[] charArray = s.toCharArray();
        Map<Character, Boolean> dir = new HashMap<>();
        for (char c : charArray) {
            if (dir.containsKey(c)) {
                dir.put(c, true);
            } else {
                dir.put(c, false);
            }
        }
        for (char c : charArray) {
            if (!dir.get(c)) {
                return c;
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        System.out.println("new FirstUniqChar().firstUniqChar() = " + new FirstUniqChar().firstUniqChar("abaccdeff"));
    }
}
