/**
 * @author Fz
 * @date 2018/8/17 15:02
 */
public class balanced_binary_tree {
    static boolean flag=true;
    public static void main(String[] args) {
        TreeNode a=new TreeNode(0);
        a.left=new TreeNode(0);
        a.left.right=new TreeNode(0);
        isBalanced(a);
        System.out.println(flag);
    }
    public static boolean isBalanced(TreeNode root){
        bianliTree(root);
        return flag;
    }
    private static int bianliTree(TreeNode root){
        if(root==null) return 0;
        int r=bianliTree(root.right);
        int l=bianliTree(root.left);
        if(Math.abs(l-r)>1){
            flag=false;
        }
        return Math.max(l,r)+1;
    }

}
