/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // Create a dummy node that points to the head
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        // Initialize current node to the dummy
        ListNode curr = dummy;
        
        // Iterate through the list
        while (curr.next != null) {
            // If the next node contains the target value, skip it
            if (curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                // Otherwise, move to the next node
                curr = curr.next;
            }
        }
        
        // Return the modified list, skipping the dummy node
        return dummy.next;
    }
}
