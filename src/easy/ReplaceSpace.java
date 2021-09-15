package easy;

import java.util.Arrays;

public class ReplaceSpace {

    public String replaceSpace(String s) {
        char[] base = new char[s.length() * 3];
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                base[index++] = '%';
                base[index++] = '2';
                base[index++] = '0';
            } else {
                base[index++] = c;

            }
        }
        return String.valueOf(base,0,index);
    }


    public static void main(String[] args) {
        String baseStr = "We are happy.";
        System.out.println("new ReplaceSpace().replaceSpace(baseStr) = " + new ReplaceSpace().replaceSpace(baseStr));
    }
}
