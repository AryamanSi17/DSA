package BST;

public class insertBST {
    Node insert(Node root,int x){
        if(root==null){
            return new Node(x);
        }
        if(x<root.data){
            root.left=insert(root.left,x);
        }
        else{
            root.right=insert(root.right,x);
        }
        return root;
    }

    //iterative soln

    Node insertIterative(Node root,int x){
        Node temp=new Node(x);
        Node parent=null,curr=root;
        while(curr!=null){
            parent=curr;
            if(x<curr.data){
                curr=curr.left;
            }
            else{
                curr=curr.right;
            }
        }
        if(parent==null)
            return temp;
        if(x<parent.data){
            parent.left=temp;
        }
        else{
            parent.right=temp;
        }
        return root;
    }
}
