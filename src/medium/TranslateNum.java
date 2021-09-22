package medium;

public class TranslateNum {
    public int translateNum(int num) {
        int result = 1;
        int pre;
        int next = 0;
        int cult = 0;
        while (num > 0) {
            pre = next;
            next = result;
            result = next;
            cult = num % 10 * 10 + cult;
            if (cult <= 25 && cult >= 10) {
                result = result + pre;
            }
            cult = cult / 10;
            num = num / 10;

        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println("new TranslateNum().translateNum(12258) = " + new TranslateNum().translateNum(12258));
    }
}
