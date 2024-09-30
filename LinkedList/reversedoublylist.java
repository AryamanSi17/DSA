public class reversedoublylist {
    public Node reverse(Node head) {
        if (head == null || head.next == null)
            return head;
        Node prev = null;
        Node curr = head;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
