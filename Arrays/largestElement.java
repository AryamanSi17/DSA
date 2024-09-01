package Arrays;

public class largestElement {
    int getLargest(int arr[]){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
}
