package SwordOffer;
import java.util.*;

/**
 * @author Fz
 * @date 2018/9/24 13:22
 */
public class 按之字形顺序打印二叉树 {
    public static void main(String[] args) {
        TreeNode a=new TreeNode(1);
        a.left=new TreeNode(2);
        a.right=new TreeNode(3);
        a.left.left=new TreeNode(4);
        a.left.right=new TreeNode(5);
        a.right.left=new TreeNode(6);
        a.right.right=new TreeNode(7);
        System.out.println(Print(a));
    }
    public static  ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        int flag=1;
        Stack<TreeNode> stack=new Stack<>();
        if(pRoot==null){
            return res;
        }
        stack.push(pRoot);
        ArrayList<Integer> temp=new ArrayList<>();
        Queue<TreeNode> treeNodes=new ArrayDeque<>();
        TreeNode treeNode=new TreeNode(0);
        while(!stack.isEmpty()){
            while (!stack.isEmpty()) {
                treeNode = stack.pop();
                temp.add(treeNode.val);
                if (flag == 1) {
                    if (treeNode.left != null) {
                        treeNodes.add(treeNode.left);
                    }
                    if (treeNode.right != null) {
                        treeNodes.add(treeNode.right);
                    }
                } else {
                    if (treeNode.right != null) {
                        treeNodes.add(treeNode.right);
                    }
                    if (treeNode.left != null) {
                        treeNodes.add(treeNode.left);
                    }
                }
            }
            while(!treeNodes.isEmpty()){
                stack.push(treeNodes.poll());
            }
            res.add(new ArrayList<>(temp));
            temp.clear();
            flag = -flag;
        }
        return res;
    }
}
