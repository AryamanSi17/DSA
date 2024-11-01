

import java.util.*;

public class levelOrderTraversalPartB {
    void printLevelOrder(Node root) {
        if(root==null){
            return;
        }

        Queue<Node> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){
            int count = q.size();
            for(int i=0;i<count;i++){
                Node curr = q.poll();

                System.out.print(curr.data + " ");

                if(curr.left!=null){
                    q.add(curr.left);
                }

                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            System.out.println();
        }
    }
}
