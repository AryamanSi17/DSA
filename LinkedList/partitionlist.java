class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class partitionlist {
    public Node partitionList(Node head,int x){
        Node lessDummy=new Node(0);
        Node greaterDummy=new Node(0);
        Node less=lessDummy;
        Node greater=greaterDummy;
        Node curr=head;
        while(curr!=null){
            if(curr.data<x){
                less.next=curr;
                less=less.next;
            }
            else{
                greater.next=curr;
                greater=greater.next;
            }
            curr=curr.next;
        }
        greater.next=null;
        less.next=greaterDummy.next;
        return lessDummy.next;
    }
}
