import java.util.ArrayDeque;
import java.util.Deque;

class MyQueue {
    private Deque<Integer> s1;
    private Deque<Integer> s2;
    public MyQueue() {
        s1=new ArrayDeque<>();
        s2=new ArrayDeque<>();
    }
    
    public void push(int x) {
        while(s1.isEmpty()==false){
            s2.push(s1.pop());
        }
        s1.push(x);
        while(s2.isEmpty()==false){
            s1.push(s2.pop());
        }
    }
    
    public int pop() {
        return s1.pop();
    }
    
    public int peek() {
        return s1.peek();
    }
    
    public boolean empty() {
          return s1.isEmpty();
    }
}

