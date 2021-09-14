package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class CopyRandomList {
    public static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }


    }

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        Map<Node, Node> nodeMap = new HashMap<>();
        Node node = new Node(head.val);
        Node step = node;
        nodeMap.put(head, node);
        while (head != null) {
            if (head.next != null) {
                Node next = nodeMap.get(head.next);
                if (next == null) {
                    next = new Node(head.next.val);
                    nodeMap.put(head.next, next);
                }
                step.next = next;
            }
            if (head.random != null) {
                Node random = nodeMap.get(head.random);
                if (random == null) {
                    random = new Node(head.random.val);
                    nodeMap.put(head.random, random);
                }
                step.random = random;
            }
            head = head.next;
            step = step.next;
        }
        return node;
    }


    public static void main(String[] args) {
        Node listNode = new Node(7);
        listNode.next = new Node(13);
        listNode.next.next = new Node(11);
        listNode.next.next.next = new Node(10);
        listNode.next.next.next.next = new Node(1);
        listNode.next.random = listNode;
        listNode.next.next.random = listNode.next.next.next.next;
        listNode.next.next.next.random = listNode.next.next;
        listNode.next.next.next.next.random = listNode;
        System.out.println("new CopyRandomList().copyRandomList(listNode) = " + new CopyRandomList().copyRandomList(listNode));
    }
}
