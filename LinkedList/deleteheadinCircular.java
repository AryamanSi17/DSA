public class deleteheadinCircular {

    Node deleteHead(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        head.data=head.next.data;
        head.next=head.next.next;

        return head;
    
}
}
