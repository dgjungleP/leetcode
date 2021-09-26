package easy;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println("new ReverseWords().reverseWords(\"the sky is blue\") = " + new ReverseWords().reverseWords("the sky is blue"));
        System.out.println("new ReverseWords().reverseWords(\"the sky is blue\") = " + new ReverseWords().reverseWords("a good   example"));
    }

    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder builder = new StringBuilder();

        int pre = s.length() - 1;
        int end;
        while (pre >= 0) {
            end = pre;
            while (pre >= 0 && s.charAt(pre) != ' ') {
                pre--;
            }
            builder.append(s, pre + 1, end + 1).append(' ');
            while (pre > 0 && s.charAt(pre) == ' ') {
                pre--;
            }
        }
        return builder.toString().trim();
    }
}
