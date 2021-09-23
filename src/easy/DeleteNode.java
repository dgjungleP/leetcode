package easy;

public class DeleteNode {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode deleteNode(ListNode head, int val) {
        ListNode pre = head;
        ListNode next = head.next;
        if (pre.val == val) {
            return next;
        }
        while (next.val != val) {
            pre = next;
            next = next.next;
        }
        pre.next = next.next;
        return head;

    }

    public static void main(String[] args) {

    }
}
