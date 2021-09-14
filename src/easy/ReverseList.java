package easy;

import java.util.Arrays;

public class ReverseList {
    public static class ListNode {
        int val;
        ListNode next;

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }

        ListNode(int x) {
            val = x;
        }


    }

    public ListNode reverseList(ListNode head) {
        ListNode pre = head;
        if (pre == null) {
            return pre;
        }
        ListNode next = head.next;
        pre.next = null;
        while (next != null) {
            ListNode node = next.next;
            next.next = pre;
            pre = next;
            next = node;
        }
        return pre;
    }


    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(3);
        listNode.next.next = new ListNode(2);
        System.out.println("new ReverseList().reverseList(listNode) = " + new ReverseList().reverseList(listNode));
    }
}
