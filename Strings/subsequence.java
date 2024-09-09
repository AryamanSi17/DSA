package Strings;

public class subsequence {
    //iterative solution
    boolean isSubseq(String s1,String s2, int n , int m){
        int j=0;
        for(int i=0;i<n;i++){
            if(s1.charAt(i)==s2.charAt(j)){
                j++;
            }
        }
        return (j==m);
    }
}
