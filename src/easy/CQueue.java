package easy;

import java.util.Stack;

public class CQueue {
    private Stack<Integer> pre;
    private Stack<Integer> next;


    public CQueue() {
        this.pre = new Stack<>();
        this.next = new Stack<>();
    }

    public void appendTail(int value) {
        pre.push(value);

    }

    public int deleteHead() {
        if(this.next.isEmpty()) {
            while (!pre.isEmpty()) {
                this.next.push(pre.pop());
            }
        }
        if (this.next.isEmpty()) {
            return -1;
        } else {
            return this.next.pop();
        }
    }

    public static void main(String[] args) {
        CQueue queue = new CQueue();
        System.out.println("queue.deleteHead() = " + queue.deleteHead());
        queue.appendTail(5);
        System.out.println("queue.deleteHead() = " + queue.deleteHead());
        queue.appendTail(3);
        queue.appendTail(2);

        System.out.println("queue.deleteHead() = " + queue.deleteHead());
        System.out.println("queue.deleteHead() = " + queue.deleteHead());

    }

}
