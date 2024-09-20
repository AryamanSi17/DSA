class Node {
    int data;
    Node next;
    public Object prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev=null;
    }
}
public class insertbeginofdoublylinkedlist {
    Node insertBegin(Node head, int data) {
        Node temp = new Node(data);
        temp.next = head;
        temp.prev = null;
        if (head != null) {
            head.prev = temp;
        }
        return temp;
    }
}
