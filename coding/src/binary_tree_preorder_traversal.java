import java.util.ArrayList;

/**
 * @author Fz
 * @date 2018/8/16 15:11
 */
public class binary_tree_preorder_traversal {
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        preorder(root,arr);
        return arr;
    }
    public static void preorder(TreeNode root,ArrayList<Integer>arr){
        if(root==null){
            return;
        }
        arr.add(root.val);
        preorder(root.left,arr);
        preorder(root.right,arr);
    }
}
