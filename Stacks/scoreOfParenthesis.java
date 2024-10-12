import java.util.ArrayDeque;
import java.util.Deque;

public class scoreOfParenthesis {
    public int scoreOfParentheses(String s) {
        int score = 0;
        Deque<Integer> stack=new ArrayDeque<Integer>();
        for(int i=0;i<=s.length();i++){
              char current=s.charAt(i);
              if(current=='('){
                  score++;
              }
              else{
                  score=stack.pop()+Math.max(2*score,1);
              }
        }
        return score;
}
}
