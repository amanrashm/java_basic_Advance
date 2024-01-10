package Trees;

import java.util.ArrayList;
import java.util.List;

/*node 2
 * node left 4
 * node left 7
 * node right 1
 * node right left 8
 * node right right 3
 * INOrder
 * PreOrder
 * PostOrder*/

public class Range_Sum_BST {
    static List<Integer> list = new ArrayList<>();
    public static int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null) return list.stream().mapToInt(Integer::intValue).sum();
        if(root.val>=low && root.val<=high) list.add(root.val);
        rangeSumBST(root.left,low,high);
        rangeSumBST(root.right,low,high);
        return list.stream().mapToInt(Integer::intValue).sum();
    }
    public static void main(String... args){
        TreeNode root = new TreeNode();
        root.val = 10;
        root.left = new TreeNode();
        root.left.val = 5;
        root.right = new TreeNode();
        root.right.val = 15;
        root.left.left = new TreeNode();
        root.left.left.val = 3;
        root.left.right = new TreeNode();
        root.left.right.val = 7;
        root.right.right = new TreeNode();
        root.right.right.val = 18;
        System.out.println(rangeSumBST(root,7,15));
    }
    /*static class TreeNode {
        int val;
        Trees.TreeNode left;
        Trees.TreeNode right;
        TreeNode() { this.val = val; }
        TreeNode(Trees.TreeNode left, Trees.TreeNode right, int val) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }*/
}