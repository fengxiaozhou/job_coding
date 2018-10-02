import java.util.ArrayList;

/**
 * @author Fz
 * @date 2018/8/17 16:32
 */
public class binary_tree_inorder_traversal {
    public static void main(String[] args) {
        TreeNode a=new TreeNode(1);
        a.left=new TreeNode(2);
        a.right=new TreeNode(3);
        a.left.left=new TreeNode(4);
        a.left.right=new TreeNode(5);
        ArrayList arr=inorderTraversal(a);
        System.out.println(arr);
    }
    public static ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> res=new ArrayList<Integer>();
        Traversal(root,res);
        return res;
    }
    public static void Traversal(TreeNode root,ArrayList res){
        if(root==null){
            return ;
        }
        Traversal(root.left,res);
        res.add(root.val);
        Traversal(root.right,res);
    }
}
