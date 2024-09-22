public class middleofLinkedList {
    //naive appraoch
    void printMiddle(Node head){
        if(head==null){
            return;
        }
        int count =0;
        Node curr=head;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        curr=head;
        for(int i=0;i<count/2;i++){
            curr=curr.next;
        }
        System.out.println(curr.data);
    }

    ////efficient appraoch - slow and fast pointer

    void printMiddle2(Node head){
        if(head==null) return;
        Node slow=head;Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
    }
}
