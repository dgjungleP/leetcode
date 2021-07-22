package medium;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CopyRandomList {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        List<Node> preList = new ArrayList<>();
        List<Node> nextList = new ArrayList<>();
        preList.add(head);
        Node result = new Node(head.val);
        nextList.add(result);
        extracted(head, preList, nextList, result);
        Node next = result;
        while (head.next != null) {
            head = head.next;
            helper(head, preList, nextList, next);
            next = next.next;
            extracted(head, preList, nextList, next);
        }
        return result;
    }

    private void helper(Node head, List<Node> preList, List<Node> nextList, Node next) {
        if (preList.contains(head)) {
            next.next = nextList.get(preList.indexOf(head));
        } else {
            next.next = new Node(head.val);
            nextList.add(next.next);
            preList.add(head);
        }
    }

    private void extracted(Node head, List<Node> preList, List<Node> nextList, Node result) {
        if (head.random != null) {
            if (preList.contains(head.random)) {
                result.random = nextList.get(preList.indexOf(head.random));
            } else {
                result.random = new Node(head.random.val);
                preList.add(head.random);
                nextList.add(result.random);
            }
        }
    }

    public static void main(String[] args) {
        Node head = new Node(7);
        Node node1 = new Node(13);
        Node node2 = new Node(11);
        Node node3 = new Node(10);
        Node node4 = new Node(1);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        node1.random = head;
        node2.random = node4;
        node3.random = node2;
        node4.random = head;

        Node node = new CopyRandomList().copyRandomList(head);
        System.out.println("node = " + node);
    }

    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
