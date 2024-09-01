import java.util.Stack;

public class sortStack {
    public static void insert(Stack <Integer> stack, int num){
        if(stack.isEmpty()){
            stack.push(num);
            return;
        }
        int top = stack.peek();
        if(top<=num){
            stack.push(num);
        }
        else{
            stack.pop();
            insert(stack,num);
            stack.push(top);
        }
    }
    public static void sortedStack(Stack <Integer> stack){

        if(stack.isEmpty()){
            return;
        }

        int num = stack.pop();
        sortedStack(stack);
        insert(stack, num);
    
    }

    
}
