class Solution {
    public void flatten(TreeNode root) {
        flattenList(root);
    }
    public TreeNode flattenList(TreeNode root){
        if(root==null) return null;
        TreeNode left=flattenList(root.left);
        TreeNode right=flattenList(root.right);
        if(left!=null){
            TreeNode trav=left;
            while(trav.right!=null){
                trav=trav.right;
            }
            trav.right=right;
            root.right=left;
            root.left=null;
        }
        return root;
    }
}