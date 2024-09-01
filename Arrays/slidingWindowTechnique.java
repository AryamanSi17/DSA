package Arrays;

public class slidingWindowTechnique {
    int maxSum(int arr[], int k){
        int curr=0;
        for(int i=0;i<k;i++){
            curr+=arr[i];
        }
        int res=curr;
        for(int i=k;i<arr.length;i++){
            curr+=arr[i]-arr[i-k];
            res=Math.max(res,curr);
        }
        return res;
    }
}
