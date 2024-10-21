package Trees;

import java.util.ArrayList;

public class serialiseTree {
    void serialise(Node root , ArrayList<Integer> arr){
        if(root==null){
            arr.add(-1);
            return;
        }
        arr.add(root.data);
        serialise(root.left,arr);
        serialise(root.right,arr);
    }
}
