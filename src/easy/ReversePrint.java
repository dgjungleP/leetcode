package easy;

import java.util.Arrays;

public class ReversePrint {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public int[] reversePrint(ListNode head) {
        if (head == null) {
            return new int[]{};
        }

        int[] pre = reversePrint(head.next);
        int[] result = new int[pre.length + 1];
        System.arraycopy(pre, 0, result, 0, pre.length);
        result[result.length - 1] = head.val;
        return result;
    }


    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(3);
        listNode.next.next = new ListNode(2);
        System.out.println("new ReversePrint().reversePrint() = " + Arrays.toString(new ReversePrint().reversePrint(listNode)));
    }
}
