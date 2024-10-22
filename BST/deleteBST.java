package BST;

public class deleteBST {
     /////// only works if successor is in right part of tree , not on left part
    //  time complexity =o(h);
    //  space complexity =o(h);
    Node delNode(Node root, int x){
        if(root==null) return null;
        if(x<root.data){
            root.left=delNode(root.left,x);
        }
        else if(x>root.data){
            root.right=delNode(root.right,x);
        }
        else{
            if(root.left==null) return root.right;
            else if(root.right==null) return root.left;
            Node succ=getSucc(root);
            root.data=succ.data;
            root.right=delNode(root.right,succ.data);
        }
        return root;
    }

    Node getSucc(Node root){
        Node curr=root.right;
        while(curr!=null && curr.left!=null){
            curr=curr.left;
        }
        return curr;
    }
}
