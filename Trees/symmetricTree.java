
public class symmetricTree {
     public boolean isSymmetric(Node root) {
        if(root==null ) return true;
        boolean result=isMirror(root.left,root.right);
        return result;
    }
    public boolean isMirror(Node left,Node right){
        if(left ==null && right ==null) return true;
        if(left == null || right==null) return false;
        
            if(left.data==right.data && isMirror(left.left, right.right) &&
                isMirror(left.right, right.left) ){
                
                return true;
            }
        return false;
    }
}
