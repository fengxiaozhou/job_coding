import java.util.ArrayList;

/**
 * @author Fz
 * @date 2018/8/16 17:14
 */
public class binary_tree_maximum_path_sum {
    static int maxValue = 0;

    public static void main(String[] args) {
        TreeNode a=new TreeNode(1);
        a.right=new TreeNode(2);
        a.left=new TreeNode(6);
        a.right.left=new TreeNode(2);
        a.right.right=new TreeNode(3);
        System.out.println(maxPathSum(a));
    }
    public static int maxPathSum(TreeNode root) {
        if (root == null)
            return 0;
        maxValue = Integer.MIN_VALUE;
        getMaxPathSum(root);
        return maxValue;
    }

    private static int getMaxPathSum(TreeNode root) {
        if (root == null)
            return 0;
        //因为节点的值可以为负数，所以最大值取0和子树值的较大者
        int leftMax = Math.max(0, getMaxPathSum(root.left));
        int rightMax = Math.max(0, getMaxPathSum(root.right));
        //如果将当前root作为根节点，那么最大值是root.val+左子树最大值+右子树最大值
        maxValue = Math.max(maxValue, root.val + leftMax + rightMax);
        //只能返回左右子树中较大值加上root.val
        return Math.max(0, root.val + Math.max(leftMax, rightMax));
    }
}
