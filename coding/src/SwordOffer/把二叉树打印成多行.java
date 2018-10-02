package SwordOffer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/**
 * @author Fz
 * @date 2018/9/24 14:14
 */
public class 把二叉树打印成多行 {
    public static void main(String[] args) {
        TreeNode a=new TreeNode(1);
        System.out.println(Print(a));
    }
    public static  ArrayList<ArrayList<Integer>> Print(TreeNode pRoot){
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        ArrayList<Integer> arr=new ArrayList<>();
        Queue<TreeNode> queue=new ArrayDeque<>();
        if(pRoot==null){
            return res;
        }
        queue.add(pRoot);
        int levNum=queue.size();
        while (queue.size()!=0){
            for(int i=0;i<levNum;i++){
                TreeNode treeNode=queue.poll();
                arr.add(treeNode.val);
                if(treeNode.left!=null){
                    queue.add(treeNode.left);
                }
                if(treeNode.right!=null){
                    queue.add(treeNode.right);
                }
            }
            levNum=queue.size();
            res.add(new ArrayList<>(arr));
            arr.clear();
        }
        return res;
    }
}
