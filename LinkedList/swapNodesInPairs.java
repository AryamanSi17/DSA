public class swapNodesInPairs {
    public Node swapNodes(Node head){

        if(head==null || head.next==null) return head;
        Node curr=head.next.next;

        Node prev=head;
        head=head.next;
        head.next=prev;
        while(curr!=null && curr.next !=null ){

            prev.next=curr.next;
            prev=curr;
            Node next=curr.next.next;
            curr.next.next=curr;
            curr.next=next;
            curr=next;
        }
        prev.next=curr;

        return head;
    }
}
