package DSAFundamentals.Trees;

public class Minimum_Depth_Binary_Tree {
    public int minDepth(TreeNode root) {
        //TODO: Write - Your - Code
        /*if(root == null) return 0;

        Queue<TreeNode> q = new LinkedList<>();
        int min_dep = 1;
        q.offer(root);

        while(!q.isEmpty()){

            int size = q.size();

            for(int i=0; i<size; i++){

                TreeNode node = q.poll();
                if(node.left==null&&node.right==null){
                    return min_dep;
                }
                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);
            }
            min_dep++;
        }
        return min_dep;*/
        if(root == null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        // If either left or right is 0, then the other side is the minimum depth
        // If both left and right are not 0, then the minimum depth is the smaller of the two
        return (left == 0 || right == 0) ?
                left + right + 1 : Math.min(left, right) + 1;
    }
    public static void main(String... args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.left.left = new TreeNode(10);
        root.left.right = new TreeNode(11);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        Minimum_Depth_Binary_Tree solution = new Minimum_Depth_Binary_Tree();
        System.out.println(solution.minDepth(root));
    }
}