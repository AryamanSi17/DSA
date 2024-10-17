package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class levelOrderTraveralPartA {
    void printLevelOrder(Node root){
        if(root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(q.size()>1){
            Node curr=q.poll();
            if(curr==null){
                System.out.println();
                q.add(null);
                continue;
        }
        System.out.println(curr.data+"");
        if(curr.right !=null) q.add(curr.right);
        if(curr.left !=null) q.add(curr.left);
    }
}
}
