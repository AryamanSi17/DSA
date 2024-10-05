class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
        this.next=null;
    }
}
public class addTwoNumbersReverse {
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode l3=new ListNode(0);
            ListNode l1m=reverse(l1);
            ListNode l2m=reverse(l2);
            ListNode head=l3;
            int carry=0;
            while(l1m !=null || l2m !=null || carry!=0)
            {
                int val1 = (l1m != null) ? l1m.val : 0;  // Use 0 if l1m is null
                int val2 = (l2m != null) ? l2m.val : 0;  // Use 0 if l2m is null
                int value=val1+val2+carry;
                carry=value/10;
                l3.next=new ListNode(value%10);
                l3=l3.next;
                if (l1m != null) l1m = l1m.next;
                if (l2m != null) l2m = l2m.next;
            }
            return reverse(head.next);
    
        }
        public ListNode reverse(ListNode head) {
            ListNode prev = null;
            ListNode current = head;
            ListNode next = null;
    
            while (current != null) {
                next = current.next;  // store the next node
                current.next = prev;   // reverse the link
                prev = current;        // move prev one step ahead
                current = next;        // move current one step ahead
            }
    
            return prev;  // prev will be the new head of the reversed list
        }
    }
    
}
