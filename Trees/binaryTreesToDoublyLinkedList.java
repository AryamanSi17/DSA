package Trees;

public class binaryTreesToDoublyLinkedList {
    Node prev=null;
    Node BTToDLL(Node root){
        if(root==null) return null;
        Node head=BTToDLL(root.left);
        if(prev==null) {
            head=root;
        }
        else{
            root.left=prev;
            prev.right=root;
        }
        prev=root;
        BTToDLL(root.right);
        return head;
    }
}
