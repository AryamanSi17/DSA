public class delete_last_node {
    Node deleteLast(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
        return head;
    }
}
