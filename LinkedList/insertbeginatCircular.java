public class insertbeginatCircular {
    //efficient method
    Node insertbegin(Node head, int x){
        Node temp=new Node(x);
        if(head==null){
            temp.next=temp;
            return temp;
        }
        else{
            temp.next=head;
            head.next=temp;
            int t=head.data;
            head.data=temp.data;
            temp.data=t;
            return head;
        }
    }
}
