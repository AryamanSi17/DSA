public class kthSmallestElementBST {
    private int count = 0;  // To track the number of nodes visited
    private int result = -1; // To store the kth smallest element
    public int kthSmallest(TreeNode root, int k) {
        inorderTraversal(root,k);
        return result;
    }
    public void inorderTraversal(TreeNode root, int k){
    if (root == null) {
        return ;
    }
    
    inorderTraversal(root.left,k);
    count ++;
    if(count==k){
        result=root.val;
        return;
    }
    inorderTraversal(root.right,k);
    
    }
}
