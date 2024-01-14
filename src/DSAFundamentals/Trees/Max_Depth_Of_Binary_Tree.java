package DSAFundamentals.Trees;
public class Max_Depth_Of_Binary_Tree {
    public static int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));
    }
    public static void main(String... args){
        TreeNode root = new TreeNode(3);
        TreeNode root1 = new TreeNode(9);
        TreeNode root2 = new TreeNode(20);
        root.left = root1;
        root.right = root2;
        TreeNode root3 = new TreeNode(15);
        TreeNode root4 = new TreeNode(7);
        root2.left = root3;
        root2.right = root4;
        System.out.println(maxDepth(root));
    }
}