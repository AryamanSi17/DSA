import java.util.*;
public class ValidPara {
    public static boolean isValidParenthesis(String expression){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < expression.length(); i++){
            char c = expression.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else if(c == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }else if(c == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }else if(c == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }else{
                return false;
            }
        }
        return stack.isEmpty();
    }

}
