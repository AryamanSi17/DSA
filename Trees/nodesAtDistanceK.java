

public class nodesAtDistanceK {
    void printKDist(Node root,int k){
        if(root==null) return;
        if(k==0){
            System.out.print(root.data+" ");
            return;
        }
        printKDist(root.left,k-1);
        printKDist(root.right,k-1);
    }
}
