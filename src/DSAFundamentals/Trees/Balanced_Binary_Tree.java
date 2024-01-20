package DSAFundamentals.Trees;
public class Balanced_Binary_Tree {
    public static boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int left = height(root.left);
        int right = height(root.right);
        return Math.abs(left-right) <= 1
                && isBalanced(root.left) && isBalanced(root.right);
    }
    private static int height(TreeNode right) {
        if(right == null) return 0;
        return 1 + Math.max(height(right.left), height(right.right));
    }
    public static void main(String... args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.left.left = new TreeNode(10);
        root.left.right = new TreeNode(11);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(isBalanced(root));
    }
}