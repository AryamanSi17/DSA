package BST;

public class floorBST {
    Node floor(Node root, int x){
        Node res=null;
        while(root!=null){
            if(x==root.data){
                return root;
            }
            if(x<root.data){
                root=root.left;
            }
            else{
                res=root;
                root=root.right;
            }
        }
        return res;
    }
}
