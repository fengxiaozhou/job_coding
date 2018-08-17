import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Stack;

/**
 * @author Fz
 * @date 2018/8/17 15:23
 */
public class binary_tree_level_order_traversal_ii {
    public static void main(String[] args) {
        TreeNode a=new TreeNode(1);
        a.left=new TreeNode(2);
        a.right=new TreeNode(3);
        a.left.left=new TreeNode(4);
        a.left.right=new TreeNode(5);
        levelOrderBottom(a);
        System.out.println("ok");
    }
    public static  ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
        Stack<ArrayList<Integer>> s=new Stack<ArrayList<Integer>>();
        if(root==null) return res;
        Deque<Integer> deque=new ArrayDeque<Integer>();
        Deque<TreeNode> deque1=new ArrayDeque<TreeNode>();
        deque.add(root.val);
        deque1.add(root);
        while(!deque.isEmpty()){
            ArrayList<Integer> arr=new ArrayList<Integer>();
            while(!deque.isEmpty()){
                arr.add(deque.pollFirst());
            }
            s.push(arr);
            int l=deque1.size();
            for(int i=0;i<l;i++){
                if(deque1.getFirst().left!=null) {
                    deque.add(deque1.getFirst().left.val);
                    deque1.add(deque1.getFirst().left);
                }
                if(deque1.getFirst().right!=null) {
                    deque.add(deque1.getFirst().right.val);
                    deque1.add(deque1.getFirst().right);
                }
                deque1.poll();
            }
        }
        while (!s.isEmpty()){
            res.add(s.pop());
        }
        return res;
    }
}
