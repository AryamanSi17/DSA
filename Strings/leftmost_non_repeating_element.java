package Strings;

public class leftmost_non_repeating_element {
    //Naive approach , we can set a flag and return it false , it repeating character is found in the string ,
    //this is easy so try to code it yourself

    //better solution which take linear time
    int non_repeating(String s){
        int [] count =new int [256];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)]++;
        }
        for(int i=0;i<s.length();i++){
            if(count[s.charAt(i)]==1){
                return i;
            }
        }
        return -1;
    }


    //efficient solution
}
