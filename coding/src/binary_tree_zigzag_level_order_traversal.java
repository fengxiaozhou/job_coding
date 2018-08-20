import java.util.ArrayList;

/**
 * @author Fz
 * @date 2018/8/20 14:06
 */
public class binary_tree_zigzag_level_order_traversal {
    public static void main(String[] args) {
        TreeNode a=new TreeNode(1);
        a.left=new TreeNode(2);
        a.right=new TreeNode(3);
        a.left.left=new TreeNode(4);
        a.left.right=new TreeNode(5);
        ArrayList<ArrayList<Integer>> res=LevelOrder(a);
        System.out.println("ok");
    }
    public static  ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
        if(root==null){
            return res;
        }
        ArrayList<TreeNode> NodeList =new ArrayList<TreeNode>();
        NodeList.add(root);
        Boolean flag=true;
        int len=0;
        while(!NodeList.isEmpty()){
            len=NodeList.size();
            ArrayList<Integer> arr=new ArrayList<Integer>();
            for (int i = 0; i <len; i++) {
                TreeNode temp = NodeList.get(i);
                if(flag)
                   arr.add(temp.val);
                else
                   arr.add(0,temp.val);
                if (temp.left != null) {
                    NodeList.add(temp.left);
                }
                if (temp.right != null) {
                    NodeList.add(temp.right);
                }
            }
            res.add(arr);
            NodeList.removeAll(NodeList.subList(0,len));
            flag=!flag;
        }
        return res;
    }

    public static  ArrayList<ArrayList<Integer>> LevelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
        if(root==null){
            return res;
        }
        ArrayList<TreeNode> NodeList =new ArrayList<TreeNode>();
        NodeList.add(root);
        int len=0;
        while(!NodeList.isEmpty()){
            len=NodeList.size();
            ArrayList<Integer> arr=new ArrayList<Integer>();
            for (int i = 0; i <len; i++) {
                TreeNode temp = NodeList.get(i);
                arr.add(temp.val);
                if (temp.left != null) {
                    NodeList.add(temp.left);
                }
                if (temp.right != null) {
                    NodeList.add(temp.right);
                }
            }
            res.add(arr);
            NodeList.removeAll(NodeList.subList(0,len));
        }
        return res;
    }
}
