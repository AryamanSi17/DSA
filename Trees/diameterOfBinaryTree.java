
public class diameterOfBinaryTree {
    private int res = 0;

    public int calculatediameter(Node root) {
        height(root);
        return res;
    }

    public int height(Node root) {
        if (root == null)
            return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        res = Math.max(res, lh + rh);
        return 1 + Math.max(lh, rh);
    }
}
