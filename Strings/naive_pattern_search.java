package Strings;
public class naive_pattern_search {
    void pat_searching(String text, String pat){
        int n=text.length();
        int m=pat.length();
        for(int i=0;i<=n-m;i++){
            int j;
            for(j=0;j<m;j++){
                if(text.charAt(i+j)!=pat.charAt(j)){
                    break;
                }
            }
            if(j==m){
                System.out.println("pattern found at index "+i);
            }
        }
    }
}
