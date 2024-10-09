public class removeDuplicatesSecond {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr=head;
        ListNode newList=new ListNode(0);
        ListNode dummy=newList;
        while(curr!=null){
            
            if(curr.next != null && curr.val==curr.next.val){
                
                while(curr.next!=null && curr.val==curr.next.val){
                    curr=curr.next;
                }
                curr=curr.next;
            }
            else{
                dummy.next = new ListNode(curr.val);
                dummy=dummy.next;
                curr=curr.next;
            }
        }
        return newList.next;
    }
}
