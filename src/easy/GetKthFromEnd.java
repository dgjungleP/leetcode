package easy;

public class GetKthFromEnd {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode pre = head;
        ListNode next = head;
        while (k > 0) {
            next = next.next;
            k--;
        }
        while (next != null) {
            pre = pre.next;
            next = next.next;
        }
        return pre;
    }

    public static void main(String[] args) {

    }
}
