public class intersectionOfTwoLinkedList {
    public Node getIntersectionNode(Node headA,Node headB) {
        int c1=0,c2=0;
        Node currA=headA;
        Node currB=headB;
        
        while(currA!=null){
            c1++;
            currA=currA.next;
        }
        while(currB!=null){
            c2++;
            currB=currB.next;
        }
        
        int d = Math.abs(c1 - c2);
        currA=headA;
        currB=headB;
        if(c1>c2){
           for(int i=0;i<d;i++){
            currA=currA.next;
           }
        }

        else{
           for(int i=0;i<d;i++){
            currB=currB.next;
           }
          
        }
        while (currA != null && currB != null) {
            if (currA == currB) {  // Return the intersecting node
                return currA;
            }
            currA = currA.next;
            currB = currB.next;
        }
    return null; 
        
    }
}
