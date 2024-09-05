package Arrays;

public class majority_element {
    public int majorityElement(int[] arr){
        int n= arr.length;
        int res=0;
        int count =1;
        for(int i=1;i<n;i++){
            if(arr[res]==arr[i]){
                count ++;
            }
            else{
                count --;
            }
            if (count == 0) {
                res = i;
                count = 1;
            }
        }
         // Step 2: Verify if the candidate is actually the majority element
         count = 0;
         for (int i = 0; i < n; i++) {
             if (arr[res] == arr[i]) {
                 count++;
             }
         }
         if (count > n / 2) {
            return arr[res];  // Return the actual element, not the index
        } else {
            return -1;  // No majority element exists
        }
    }
}
