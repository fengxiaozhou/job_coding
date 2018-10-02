package SwordOffer;

/**
 * @author Fz
 * @date 2018/9/24 14:42
 */
public class 二叉搜索树的第k个结点$ {
    static int index=0;

    public static void main(String[] args) {
        TreeNode a=new TreeNode(1);
        a.left=new TreeNode(3);
        a.right=new TreeNode(6);
        a.left.left=new TreeNode(2);
        a.left.right=new TreeNode(4);
        a.right.left=new TreeNode(5);
        a.right.right=new TreeNode(7);
        System.out.println(KthTreeNode(a,5).val);
    }
    public static TreeNode KthTreeNode(TreeNode root, int k){
        if(root==null){
            return null;
        }
        TreeNode node=KthTreeNode(root.left,k);
        if(node!=null) return node;
        index++;
        if(index==k) return root;
        node =KthTreeNode(root.right,k);
        if(node!=null)
            return node;
        return null;
    }
}
