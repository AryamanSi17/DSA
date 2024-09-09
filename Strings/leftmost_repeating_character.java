package Strings;

public class leftmost_repeating_character {
    //naive approach
    public void leftmost(String s){
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    System.out.println(s.charAt(i));
                }
            }
        }
    }
    //efficient approach    
    int leftmost_char(String s){
        boolean[] visited =new boolean[256];
        int res=-1;
        for(int i=s.length()-1;i>=0;i--){
            if(visited[s.charAt(i)]){
                res=i;
            }
            else{
                visited[s.charAt(i)]=true;
            }

        }
        return res;
    }
}
