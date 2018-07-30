import java.util.LinkedList;
import java.util.Queue;

public class find_tree_mini_depth {
    public static void main(String[] args) {

    }
}
class Solution{
    /**
     * 深度遍历（dfs）
     * @param root
     * @return
     */
    public int run(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=run(root.left);
        int r=run(root.right);
        if(l==0||r==0){
            return l+r+1;
        }
        return Math.min(l,r)+1;
    }

    /**
     * 广度遍历（hfs）
     *
     */
    public int run2(TreeNode root){ if(root==null){
            return 0;
        }
        LinkedList<TreeNode> queue=new LinkedList<TreeNode>();
        LinkedList<TreeNode> layerList=new LinkedList<TreeNode>();
        queue.addFirst(root);
        int start=0;
        int end=1;
        int level=1;
        while(!queue.isEmpty()){
            TreeNode temp=queue.removeLast();
            start++;
            layerList.addFirst(temp);
            if(temp.left==null &&temp.right==null){
                return level;
            }
            if(temp.left!=null){
                queue.addFirst(temp.left);
            }
            if(temp.right!=null){
                queue.addFirst(temp.right);
            }
            if (start == end) {
                level++;
                start = 0;
                end = queue.size();
                layerList = new LinkedList<TreeNode>();
            }
        }
        return level;
    }

    /**
     * 简单易懂
     */
    public int run3(TreeNode root){
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        int depth=0;
        Queue<TreeNode> queue=new LinkedList();
        queue.offer(root);
        while(!queue.isEmpty()){
            int len=queue.size();
            depth++;
            for(int i=0;i<len;i++){
                TreeNode temp=queue.poll();
                if(temp.right==null&&temp.left==null){
                    return depth;
                }
                if(temp.left!=null){
                   queue.offer(temp.left);
                }
                if(temp.right!=null){
                    queue.offer(temp.right);
                }
            }
        }
        return 0;
    }
}
