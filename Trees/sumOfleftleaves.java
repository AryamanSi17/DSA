public class sumofLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null) return 0;
        int sum=0;
        if(root.left!=null && root.left.left==null && root.left.right==null){
            sum=sum+root.left.val;
        }
        sum=sum+sumOfLeftLeaves(root.left);
        sum=sum+sumOfLeftLeaves(root.right);

        return sum;
    }
}
