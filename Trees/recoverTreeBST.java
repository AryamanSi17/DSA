package Trees;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
}
public class recoverTreeBST {
    TreeNode prev=null,first=null,second=null;
    public void recoverTree(TreeNode root) {
        if(root==null) return;
        inorder(root);
        int temp=first.val;
        first.val=second.val;
        second.val=temp;
    }
    void inorder(TreeNode root){
        if(root==null) return ;
        inorder(root.left);
        if(prev!=null && root.val<prev.val){
            if(first==null){
                 first=prev;
            }
            second =root;
        }
        prev=root;
        inorder(root.right);
    }
}
