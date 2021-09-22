package medium;

import java.util.HashMap;
import java.util.Map;

public class SubStringLength {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> hashMap = new HashMap<>();
        int result = 0;
        int pre = -1;
        int next = 0;
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            Integer preIndex = hashMap.get(array[i]);
            if (preIndex != null) {
                hashMap.remove(array[i]);
                pre = preIndex > pre ? preIndex : pre;
            }
            hashMap.put(array[i], i);
            result = Math.max(result, next - pre);
            next++;
        }
        return result;
    }

    public static void main(String[] args) {
//        System.out.println("new SubStringLength().lengthOfLongestSubstring(\"abcabcbb\") = " + new SubStringLength().lengthOfLongestSubstring("abcabcbb"));
//        System.out.println("new SubStringLength().lengthOfLongestSubstring(\"abcabcbb\") = " + new SubStringLength().lengthOfLongestSubstring("bbbbb"));
//        System.out.println("new SubStringLength().lengthOfLongestSubstring(\"abcabcbb\") = " + new SubStringLength().lengthOfLongestSubstring("cdd"));
        System.out.println("new SubStringLength().lengthOfLongestSubstring(\"abcabcbb\") = " + new SubStringLength().lengthOfLongestSubstring("abba"));
    }
}
