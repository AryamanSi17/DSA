import java.util.Stack;

public class pushAtBottom {
    public static Stack<Integer> pushAtBottomStack(Stack <Integer> s, int data) {
        if(s.isEmpty()) {
            s.push(data);
            return s;
        }
        int i = s.pop();
        s = pushAtBottomStack(s, data);
        s.push(i);
        return s;
    }
}
