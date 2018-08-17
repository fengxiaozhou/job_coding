import java.util.ArrayList;

/**
 * @author Fz
 * @date 2018/8/17 16:32
 */
public class binary_tree_inorder_traversal {
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> res=new ArrayList<Integer>();
        Traversal(root,res);
        return res;
    }
    public void Traversal(TreeNode root,ArrayList res){
        if(root==null){
            return ;
        }
        Traversal(root.left,res);
        res.add(root.val);
        Traversal(root.right,res);
    }
}
