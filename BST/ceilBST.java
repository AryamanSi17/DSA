package BST;

public class ceilBST {
    Node ceil(Node root, int x){
        Node res=null;
        while(root!=null){
            if(x==root.data){
                return root;
            }
            if(x<root.data){
                res=root;
                root=root.left;
            }
            else{
               
                root=root.right;
            }
        }
        return res;
    }
}
