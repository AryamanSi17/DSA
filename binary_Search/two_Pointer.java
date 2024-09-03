public class two_Pointer {
    boolean isPair(int arr[], int x){
        int n=arr.length;
        int i=0; int j =n-1;
        while(i<j){
            if(arr[i]+arr[j]==x){
                return true;

            }
            else if(arr[i]+arr[j]<x){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }
}
