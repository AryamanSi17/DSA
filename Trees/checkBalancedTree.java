public class checkBalancedTree {
    int isBalanced(Node root) {
        
        if(root==null){ 
            return 0;
        }
        int lh=isBalanced(root.left);
        if(lh==-1){
            return -1;
        }
        int rh=isBalanced(root.right);
        if(rh==-1){
            return -1;
        }
        if(Math.abs(lh-rh)>1){
            return -1;
        }
        return Math.max(lh,rh)+1;
    }
}
