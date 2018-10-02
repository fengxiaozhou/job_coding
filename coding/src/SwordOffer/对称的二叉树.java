package SwordOffer;

/**
 * @author Fz
 * @date 2018/9/24 20:06
 */
public class 对称的二叉树 {
    boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot==null) {
            return true;
        }
        return combine(pRoot.left,pRoot.right);
    }

    private boolean combine(TreeNode n1,TreeNode n2){
        if(n1==null) return n2==null;
        if(n2==null) return false;
        if(n1.val!=n2.val) return false;
        return combine(n1.right,n2.left)&&combine(n1.left,n2.right);
    }

}
