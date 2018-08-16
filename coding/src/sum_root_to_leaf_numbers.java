import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author Fz
 * @date 2018/8/16 15:46
 */
public class sum_root_to_leaf_numbers {
    public static void main(String[] args) {
        TreeNode a=new TreeNode(0);
        a.right=new TreeNode(2);
        a.left=new TreeNode(6);
        a.right.left=new TreeNode(2);
        a.right.right=new TreeNode(3);
        ArrayList<String> arr=new ArrayList<String>();
        System.out.println(sumNumbers(a));
    }

    public static int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        ArrayList<String> arr=new ArrayList<String>();
        paths(root,"",arr);
        int sum=0;
        for (String s:arr) {
            sum=Integer.valueOf(s)+sum;
        }
        return sum;
    }
    public static void paths(TreeNode root,String s, ArrayList<String>arr) {
        if (root.left == null && root.right == null) {
            s = s + String.valueOf(root.val);
            arr.add(s);
            return;
        }
        if (root.left != null) {
            s = s + String.valueOf(root.val);
            paths(root.left, s, arr);
            s = s.substring(0, s.length() - 1);
        }
        if (root.right != null) {
            s = s + String.valueOf(root.val);
            paths(root.right, s, arr);
            s = s.substring(0, s.length() - 1);

        }
    }
}
