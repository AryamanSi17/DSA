

public class deSerialiseTree {
private int EMPTY=-1,index=0;

public Node deSerialise(int[] arr) {
    if(index==arr.length || arr[index]==EMPTY) return null;
    Node root=new Node(arr[index++]);
    root.left=deSerialise(arr);
    root.right=deSerialise(arr);
    return root;

}

}
