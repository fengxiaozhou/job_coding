package SwordOffer;

/**
 * @author Fz
 * @date 2018/10/8 19:10
 */
public class 树的子结构 {
    public static boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean result = false;
        if(root1!=null&&root2!=null) {
            if (root1.val == root2.val) {
                result=doesTree1HaveTree2(root1, root2);
            }
            if(!result) {
                result = HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
            }
        }
        return result;
    }
    public static boolean doesTree1HaveTree2(TreeNode root1,TreeNode root2){
        if(root2==null){
            return true;
        }
        if(root1==null){
            return false;
        }
        if(root1.val!=root2.val){
            return false;
        }
        return doesTree1HaveTree2(root1.left,root2.left)&&doesTree1HaveTree2(root1.right,root2.right);
    }
}
