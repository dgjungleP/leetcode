package easy;

public class GetIntersectionNode {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int count = 0;
        ListNode loopA = headA;
        ListNode loopB = headB;
        while (loopA != null && loopB != null) {
            if (loopA.equals(loopB)) {
                return loopA;
            }
            loopA = loopA.next;
            loopB = loopB.next;
            if (loopA == null && count < 2) {
                loopA = headB;
                count++;
            }
            if (loopB == null && count < 2) {
                loopB = headA;
                count++;
            }

        }
        return null;
    }
}
