package SwordOffer;

import java.util.Arrays;

/**
 * @author Fz
 * @date 2018/10/6 14:40
 */
public class 重建二叉树 {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length==0 || in.length==0){
            return null;
        }
        TreeNode head=new TreeNode(pre[0]);
        for(int i=0;i<in.length;i++){
            if(pre[0]==in[i]){
                head.left=reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(in,0,i));
                head.right=reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in,i+1,pre.length));
            }
        }
        return head;
    }
}
