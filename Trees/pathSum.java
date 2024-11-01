

import javax.swing.tree.TreeNode;

public class pathSum {
    public boolean hasPathSum(Node root, int targetSum) {
        if (root == null) {
            return false;
        }
        
        if (root.left == null && root.right == null) {
            return targetSum == root.data;
        }
        
        boolean leftSum = hasPathSum(root.left, targetSum - root.data);
        boolean rightSum = hasPathSum(root.right, targetSum - root.data);
        
        return leftSum || rightSum;
    }
}
