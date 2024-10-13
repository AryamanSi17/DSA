import java.util.ArrayDeque;
import java.util.Deque;
public class stockSpanProblem {
    //naive solution 
    void printSpan(int arr[], int n){
        for (int i=0;i<n;i++){
            int span=1;
            for(int j=i-1;j>=0 && arr[j] <= arr[i];j--){
                span++;
            }
               System.out.println(span);
        }
     
    }
    ///
    ////
    //efficient solution 
    void printSpanEff(int arr[], int n){
        Deque<Integer> stack=new ArrayDeque<Integer>();
        stack.push(0);
        System.out.println(1);
        for(int i=1;i<n;i++){
            while(!stack.isEmpty() && arr[stack.peek()] <= arr[i])
                stack.pop();

            int span=stack.isEmpty()?i+1:i-stack.peek();

            System.out.println(span);
            stack.push(i);
        }
    }
}
