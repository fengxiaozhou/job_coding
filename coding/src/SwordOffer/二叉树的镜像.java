package SwordOffer;

/**
 * @author Fz
 * @date 2018/10/8 19:27
 */
public class 二叉树的镜像 {
    public void Mirror(TreeNode root) {
       if(root==null)
           return;
       if(root.left!=null||root.right!=null){
            TreeNode temp=root.left;
            root.left=root.right;
            root.right=temp;
        }
        Mirror(root.left);
        Mirror(root.right);
    }
}
