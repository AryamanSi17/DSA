public class sortedinsert {
    Node sortedInsert(Node head, int data) {
        Node temp=new Node(data);
        if(head==null){
            return temp;

        }
        if(data<head.data){
            temp.next=head;
            return temp;
        }
        Node curr=head;
        while(curr.next!=null && curr.next.data<data){
            curr=curr.next;
        }
        temp.next=curr.next;
        curr.next=temp;
        return head;
    }

}
