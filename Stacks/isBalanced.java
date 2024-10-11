import java.util.ArrayDeque;
import java.util.Deque;

public class isBalanced {
    boolean checkIsBalanced(String str) {
        // Specify the type argument <Character>
        Deque<Character> s = new ArrayDeque<Character>();

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);

            // Push opening brackets to stack
            if (current == '(' || current == '{' || current == '[') {
                s.push(current);
            }
            // Handle closing brackets
            else if (current == ')' || current == '}' || current == ']') {
                if (s.isEmpty()) {
                    return false;
                }

                // Check if the current closing bracket matches the top of the stack
                char top = s.peek();
                if ((current == ')' && top == '(') ||
                    (current == '}' && top == '{') ||
                    (current == ']' && top == '[')) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }

        // If the stack is empty, all brackets are balanced
        return s.isEmpty();
    }
}
