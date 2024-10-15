package Queue;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;



//Recursie Solution/


class StackUsingOneQueue {
    private Queue<Integer> queue = new LinkedList<>();

    // Push operation
    public void push(int x) {
        // Add the new element to the queue
        int size = queue.size();
        queue.add(x);

        // Rotate the previous elements to the back of the queue
        moveToBack(size);
    }

    // Helper function to move elements to the back recursively
    private void moveToBack(int size) {
        if (size <= 0) {
            return;
        }

        // Remove the front element and add it back to the end
        int front = queue.remove();
        queue.add(front);

        // Recursively move the remaining elements to the back
        moveToBack(size - 1);
    }

    // Pop operation
    public int pop() {
        if (queue.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return queue.remove();
    }

    // Peek operation
    public int top() {
        if (queue.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return queue.peek();
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingOneQueue stack = new StackUsingOneQueue();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element is: " + stack.top()); // Output: 3
        System.out.println("Popped element is: " + stack.pop()); // Output: 3
        System.out.println("Top element is: " + stack.top()); // Output: 2
    }
}


class MyStack {
    private Queue<Integer> q1;
    private Queue<Integer> q2;
    public MyStack() {
        q1=new ArrayDeque<Integer>();
        q2=new ArrayDeque<Integer>();
    }
    
    public void push(int x) {
        while(q1.isEmpty()==false){
            q2.offer(q1.peek());
            q1.poll();
        }
        q1.offer(x);
        while(q2.isEmpty()==false){
            q1.offer(q2.peek());
            q2.poll();
        }
    }
    
    public int pop() {
        return q1.poll();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
       return q1.isEmpty();

    }
}

