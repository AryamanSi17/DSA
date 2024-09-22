public class nthnodefromend {
    //Strps:-
    // Move 'first' n positions ahead
    // Start 'second ' pointer from head
    // Move both first and second at same speed ,when 'first ' reaches , 'second ' pointer reaches required node.
    void printnthnode(Node head,int n){
        if(head==null ) return;

        Node first=head;
        for(int i=0;i<n;i++){
            if(first==null) return;
            first=first.next;
        }

        Node second=head;
        while(first!=null){
            first=first.next;
            second=second.next;
        }
        System.out.println(second.data);
    }
}
