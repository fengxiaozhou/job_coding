public class path_sum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null){
            return false;
        }
        if(root.right==null&&root.right==null){
            if(sum-root.val==0){
                return true;
            }
            else return false;
        }
        boolean left=hasPathSum(root.left,sum-root.val);
        boolean right=hasPathSum(root.right,sum-root.val);
        return left||right;
    }
}
