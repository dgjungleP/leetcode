package easy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinStack {
    private List<Integer> data;
    private Integer min = Integer.MAX_VALUE;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        this.data = new ArrayList<>();
    }

    public void push(int x) {
        this.data.add(x);
        if (this.min >= x) {
            this.min = x;
        }
    }

    public void pop() {
        this.data.remove(this.data.size() - 1);
        if (!this.data.isEmpty()) {
            this.min = this.data.stream().min(Comparator.comparingInt(data -> data)).get();
        } else {
            this.min = Integer.MAX_VALUE;
        }
    }

    public int top() {
        return this.data.get(this.data.size() - 1);
    }

    public int min() {
        return min;
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(2147483646);
        minStack.push(2147483646);
        minStack.push(2147483647);
        System.out.println("minStack.top() = " + minStack.top());
        minStack.pop();
        System.out.println("minStack.min() = " + minStack.min());
        minStack.pop();
        System.out.println("minStack.min() = " + minStack.min());
        minStack.pop();
        minStack.push(2147483647);
        System.out.println("minStack.min() = " + minStack.top());
        System.out.println("minStack.min() = " + minStack.min());
        minStack.push(-2147483648);
        System.out.println("minStack.min() = " + minStack.top());
        System.out.println("minStack.min() = " + minStack.min());
        minStack.pop();
        System.out.println("minStack.min() = " + minStack.min());

    }
}
