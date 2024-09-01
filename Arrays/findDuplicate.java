package Arrays;

public class findDuplicate {
    public int findDuplicateinArray(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int j=Math.abs(nums[i]);
            if(nums[j]<0){
                return j;
            }
            nums[j]=-nums[j];
        }
        return -1;
    }
}
//more optimised
// class Solution {
//     public int findDuplicate(int[] nums) {
//         boolean[] arr = new boolean[nums.length];
//         for (int num: nums){
//             if (arr[num]) {
//                 return num;
//             }
//             arr[num] = true;
//         }
//         return -1;
//     }
// }