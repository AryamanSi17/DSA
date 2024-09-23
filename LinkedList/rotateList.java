public class rotateList {
    public Node rotateRight(Node head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        Node curr=head;
        int count =1;
        while(curr.next!=null){
            count ++;
            curr=curr.next;
        }
       curr.next=head;
       k=k%count;
       int stepsToNewHead=count-k;
       Node newTail=head;
       for(int i=1;i<stepsToNewHead;i++){
        newTail=newTail.next;
       }
       Node newHead=newTail.next;
       newTail.next=null;
       return newHead;
    }
}
