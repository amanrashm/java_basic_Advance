package DSAFundamentals.Trees;
public class RootEqualsSumOfChild {
    public static boolean checkTree(TreeNode root) {
        if(root == null) return true;
        if(root.left == null && root.right == null) return true;
        int sum = 0;
        if(root.left != null) sum += root.left.val;
        if(root.right != null) sum += root.right.val;
        return root.val == sum && checkTree(root.left) && checkTree(root.right);
    }
    public static void main(String... args) {
        var root = new TreeNode(10);
        root.left = new TreeNode(8);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(2);
        System.out.println(checkTree(root));
    }
}