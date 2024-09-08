package Strings;

public class palindrome_check {
    //naive method-theta n time , theta n auxillary space;
    boolean isPalindrome(String s) {
        StringBuilder rev=new StringBuilder(s);
        rev.reverse();
        if(rev.toString().equals(s)){
            return true;
        }
        else{
            return false;
        }
    }
    //efficient method 
    //see from both leftest and rightest then move inward

    boolean isPalindrome2(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
