package Trees;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() { this.val = val; }
    TreeNode(TreeNode left, TreeNode right, int val) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
/*node 2
* node left 4
* node left 7
* node right 1
* node right left 8
* node right right 3
* INOrder
* PreOrder
* PostOrder*/
public class BT_Inorder_Traversal {
    static List<Integer> list = new ArrayList<>();
    public static List<Integer> inorderTraversal(TreeNode root) {
        if(root==null) return new ArrayList<>();
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
        return list;
    }
    public static void main(String [] args) {
        TreeNode root = new TreeNode();
        inorderTraversal(root).forEach(System.out::println);
    }
}