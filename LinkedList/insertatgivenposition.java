class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class insertatgivenposition {

    Node insertPos(Node head, int pos, int data) {
        Node temp = new Node(data);

        // If the position is 1, insert at the head.
        if (pos == 1) {
            temp.next = head;
            return temp;
        }

        Node curr = head;
        // Traverse to the node before the desired position
        for (int i = 1; i <= pos - 2 && curr != null; i++) {
            curr = curr.next;
        }

        // If the current node is null, the position is out of bounds
        if (curr == null) {
            return head;
        }

        // Insert the new node at the correct position
        temp.next = curr.next;
        curr.next = temp;

        return head;
    }
}
