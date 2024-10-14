import java.util.Deque;
import java.util.ArrayDeque;
class MinStack {
    private Deque<Integer> s;
    private Deque<Integer> minStack;

    public MinStack() {
        s = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }

    public void push(int val) {
        s.push(val);
        // If minStack is empty or the new value is less than or equal to the current minimum
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        int removed = s.pop();
        // If the removed value is the current minimum, pop it from minStack too
        if (removed == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
