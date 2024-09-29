public class reverseListsecond {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;
    
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
    
        // Move prev to the node just before the leftth position
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }
    
        // 'start' will eventually be the tail of the reversed sublist
        ListNode start = prev.next;
        ListNode then = start.next;
    
        // Reverse the sublist between left and right
        for (int i = 0; i < right - left; i++) {
            start.next = then.next;   // Detach 'then' from the sublist
            then.next = prev.next;    // Insert 'then' at the beginning of the sublist
            prev.next = then;         // Move 'prev' to point to 'then'
            then = start.next;        // Move 'then' to the next node to be processed
        }
    
        return dummy.next;  // Return the modified list
    }
    
}
