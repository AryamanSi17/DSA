package Trees;

public class lowestCommonAncestorFind {
    public Node lowestCommonAncestor(Node root, Node p, Node q) {
        if(root==null) return null;
        if(root.data == p.data || root.data == q.data) return root;
        Node lca1=lowestCommonAncestor(root.left,p,q);
        Node lca2=lowestCommonAncestor(root.right,p,q);
        if(lca1!=null && lca2!=null) {
            return root;
        }
        if(lca1!=null) return lca1;
        else return lca2;
    }
}
