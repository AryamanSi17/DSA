import java.util.ArrayDeque;
import java.util.Deque;

public class largestRectangle {
    public int largestRectangleArea(int[] arr) {
        int t = arr.length;
        Deque<Integer> s=new ArrayDeque<>();
        int res=0;int tp;int curr;
        for(int i=0;i<t;i++){
            while(s.isEmpty()==false && arr[s.peek()]>=arr[i]){
                tp=s.pop();
                curr=arr[tp]*(s.isEmpty()?i:(i-s.peek()-1));
                res=Math.max(res,curr);
            }
            s.push(i);
        }
        while(!s.isEmpty()){
                tp=s.pop();
                curr=arr[tp]*(s.isEmpty()?t:(t-s.peek()-1));
                res=Math.max(res,curr);
            }
            return res;
    }
}
