package Strings;

public class reverse_string {
    //naive method -to create a stack ,
    //push words
    //pop words one by one

    //efficient method -reverse the string
     void reverse_words(char str[],int n){
         int start=0;
         for(int end=0;end<n;end++){
             if(str[end]==' '){
                 reverse(str,start,end-1);
                 start=end+1;
             }
         }
         reverse(str,start,n-1);
         reverse(str,0,n-1);


     }
     void reverse(char str[],int low,int high){
         while(low<high){
             char temp=str[low];
             str[low]=str[high];
             str[high]=temp;
             low++;
             high--;
         }
     }
}
