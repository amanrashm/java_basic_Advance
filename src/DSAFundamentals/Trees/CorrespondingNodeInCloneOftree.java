package DSAFundamentals.Trees;
public class CorrespondingNodeInCloneOftree {
    static TreeNode result;
    public static final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(original != null){
            if(original.val == target.val){
                result = cloned;
            }
            getTargetCopy(original.left,cloned.left,target);
            getTargetCopy(original.right,cloned.right,target);
        }
        return result;
    }
    public static void main(String... args){
    }
}