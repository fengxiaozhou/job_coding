import java.util.ArrayList;
import java.util.Stack;

public class binary_tree_postorder_traversal {
    public static void main(String[] args) {

    }

    /**
     * 递归效率不高~~
     * @param root
     * @return
     */
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(root == null){
            return list;
        }
        test(root,list);
        return list;
    }

    public void test(TreeNode node,ArrayList<Integer> list){
        if(node.left != null){
            test(node.left,list);
        }
        if(node.right != null){
            test(node.right,list);
        }
        list.add(node.val);
    }

    /**
     * 入栈，然后从列表的头部插入~~
     * @param root
     * @return
     */
    public ArrayList<Integer> postorderTraversal1(TreeNode root){
        ArrayList<Integer> list=new ArrayList<Integer>();
        Stack<TreeNode> stack =new Stack<>();
        if(root==null){
            return list;
        }
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node=stack.pop();
            list.add(0,node.val);
            if(node.left!=null){
                stack.push(node.left);
            }
            if(node.right!=null){
                stack.push(node.right);
            }
        }
        return list;
    }


    /**
     *
     */
    public ArrayList<Integer> postorderTraversal2(TreeNode root) {
        TreeNode p = root, r = null;        //P记录当前节点，r用来记录上一次访问的节点
        Stack<TreeNode> s = new Stack<TreeNode>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(p != null || !s.isEmpty()) {
            if(p != null) {     //左孩子一直入栈，直到左孩子为空
                s.push(p);
                p = p.left;
            } else {
                p = s.peek();
                p = p.right;
                if(p != null && p != r) {   //如果栈顶元素的右孩子不为空，且未被访问过
                    s.push(p);              //则右孩子进栈，然后重复左孩子一直进栈直到为空的过程
                    p = p.left;
                } else {
                    p = s.pop();            //否则出栈，访问，r记录刚刚访问的节点
                    list.add(p.val);
                    r = p;
                    p = null;
                }
            }
        }
        return list;
    }
}
