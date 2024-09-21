public class deletekthnodeinCircular {
    Node deleteNode(Node head,int k){
        if(head==null || head.next==null) return null;
        if(k==1)
        {
            //apply function for deleting head
            
        head.data=head.next.data;
        head.next=head.next.next;

        return head;
        }

        Node curr=head;

        for(int i=1;i<k-2;i++)
        {
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }
}
