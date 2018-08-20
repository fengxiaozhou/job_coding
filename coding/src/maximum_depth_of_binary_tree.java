/**
 * @author Fz
 * @date 2018/8/20 13:46
 */
public class maximum_depth_of_binary_tree {
    public static void main(String[] args) {
        TreeNode a=new TreeNode(1);
        a.left=new TreeNode(2);
        a.right=new TreeNode(3);
        a.left.left=new TreeNode(4);
        a.right.right=new TreeNode(5);
        int res=maxDepth(a);
        System.out.println("ok");
    }
    static int res=0;
    public static int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        res=Math.max(maxDepth(root.left),maxDepth(root.right))+1;
        return res;
    }
}
