package DSAFundamentals.Trees;
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isSymmetrics(root.left, root.right);
    }
    private static boolean isSymmetrics(TreeNode left, TreeNode right) {
        if(left == null && right == null) return true;
        else if(left == null | right == null) return false;
        else if(left.val != right.val) return false;
        else return isSymmetrics(left.left, right.right) && isSymmetrics(left.right, right.left);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode root1 = new TreeNode(2);
        TreeNode root2 = new TreeNode(2);
        root.left = root1;
        root.right = root2;
        TreeNode root3 = new TreeNode(3);
        TreeNode root4 = new TreeNode(4);
        root1.left = root3;
        root1.right = root4;
        TreeNode root5 = new TreeNode(4);
        TreeNode root6 = new TreeNode(3);
        root2.left = root5;
        root2.right = root6;
        SymmetricTree st = new SymmetricTree();
        System.out.println(st.isSymmetric(root));
    }
}