package Trees;

import java.util.Arrays;

public class SortedArray_To_BinaryTree {
    public static TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        return helper(nums, 0, nums.length-1);
    }
    private static TreeNode helper(int[] nums, int left, int right) {
        if(left > right) return null;
        int mid = (left + right)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, left, mid-1);
        root.right = helper(nums, mid+1, right);
        return root;
    }
    public static void main(String[] args) {
        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode root = sortedArrayToBST(nums);
        assert root != null;
        for (TreeNode treeNode : Arrays.asList(root, root.left, root.right, root.left.right, root.right.right)) {
            System.out.print(treeNode.val);
        }
    }
}