public class palindromeLsit {
    class Solution {
        public boolean isPalindrome(ListNode head) {
            ListNode fast=head;
            ListNode slow=head;
            while(fast!=null && fast.next !=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            ListNode secondHalfStart=slow;
            ListNode prev=null;
            ListNode curr=secondHalfStart;
    
            while(curr!=null){
                ListNode next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            ListNode secondHalfCopy=prev;
            ListNode firstHalfStart=head;
            while (secondHalfCopy != null) {
                if (firstHalfStart.val != secondHalfCopy.val) {
                    return false;
                }
                firstHalfStart = firstHalfStart.next;
                secondHalfCopy = secondHalfCopy.next;
            }
            return true;
    
        }
    }
}
