class Node {
    int data;
    Node next;
    Node prev;
    public Node left;
    public Node right;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev=null;
    }
}
public class deletelastnodeofdoublylinkedlist {
    public Node delNode(Node head){
        if(head==null || head.next==null) return null;

        Node curr=head;
        while(curr.next.next!=null){
            curr=curr.next;
        }
        curr.prev.next=null;
        return head;
    }
}
