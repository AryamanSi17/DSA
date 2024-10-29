
import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class sortedArrayToHeightBalancedTree {
    public Node sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length-1);
    }
    private Node helper(int[] nums,int left, int right){
        if(left>right) return null;
        int mid=(left+right)/2;
        Node root=new Node(nums[mid]);
        root.left=helper(nums,left,mid-1);
        root.right=helper(nums,mid+1,right);
        return root;
    }
}