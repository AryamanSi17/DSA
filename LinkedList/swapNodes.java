public class swapNodes {
    public Node swapNode(Node head, int k) {
        Node frontNode = null;
        Node endNode = head;
        Node currentNode = head;
        // set the front node and end node in single pass
        for(int i=0;i<k-1;i++) currentNode=currentNode.next;           
        frontNode=currentNode;
        while(currentNode.next!=null){
            currentNode=currentNode.next;
            endNode=endNode.next;
        }
        // swap the values of front node and end node
        int temp = frontNode.data;
        frontNode.data = endNode.data;
        endNode.data = temp;
        return head;
    }
}
