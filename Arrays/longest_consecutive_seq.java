package Arrays;

import java.util.Arrays;

public class longest_consecutive_seq {
    public int longestConsecutive(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        if(n==0) return 0;
        int longest_Streak=1; int current_Streak=1;
        for(int i=1;i<n;i++){
           if(arr[i]!=arr[i-1]){
            if(arr[i]==arr[i-1]+1){
                current_Streak++;
            }
            else{
                longest_Streak=Math.max(current_Streak,longest_Streak);
                current_Streak=1;
            }
           }
            
        }
        return Math.max(current_Streak,longest_Streak);
    }
}
