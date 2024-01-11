package Trees;
public class Same_Tree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        else if(p == null && q != null) return false;
        else if(p != null && q == null) return false;
        else if(p.val != q.val) return false;
        else return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        TreeNode p1 = new TreeNode(2);
//        TreeNode p2 = new TreeNode(3);
        p.left = p1;
        //p.right = p2;
        TreeNode q = new TreeNode(1);
        TreeNode q1 = new TreeNode(null);
        TreeNode q2 = new TreeNode(2);
        q.left = q1;
        q.right = q2;
        Same_Tree st = new Same_Tree();
        System.out.println(st.isSameTree(p, q));
    }
}