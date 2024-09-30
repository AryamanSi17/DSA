public class odd_even_list {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next == null ) return head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode even_head=head.next;
        while(odd !=null && even !=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=even_head;

    return head;
    }
}
