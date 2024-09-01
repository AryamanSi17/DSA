import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class redundantBracket{
    public static boolean findRedundantBracket (String s){
        Stack<Character> stack = new Stack<>();
        List<Character> operators=Arrays.asList('+','-','*','/');
        for(char ch:s.toCharArray()){
            if(ch=='(' || operators.contains(ch)){
                stack.push(ch);
            }
            else if (ch==')'){
                char top=stack.pop();
                if(!operators.contains(top)) return true;
                while(!stack.isEmpty() && operators.contains(stack.peek())){
                    stack.pop();
                }
                stack.pop();
            }
        }
        return false;
    }
}