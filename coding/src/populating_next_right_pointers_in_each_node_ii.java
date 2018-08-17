import java.awt.geom.QuadCurve2D;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

/**
 * @author Fz
 * @date 2018/8/17 12:25
 */
public class populating_next_right_pointers_in_each_node_ii {
    public static void main(String[] args) {
        TreeLinkNode a=new TreeLinkNode(1);
        a.left=new TreeLinkNode(2);
        a.right=new TreeLinkNode(3);
        a.left.left=new TreeLinkNode(4);
        a.left.right=new TreeLinkNode(5);
        a.right.right=new TreeLinkNode(7);
        connect2(a);
        System.out.println("ok");
    }
    public static void connect(TreeLinkNode root) {
        Deque<TreeLinkNode> q=new ArrayDeque<TreeLinkNode>();
        Deque<TreeLinkNode> t=new ArrayDeque<TreeLinkNode>();
        TreeLinkNode temp;
        if(root==null) return;
        t.add(root);
        while(!t.isEmpty()){
            while(!t.isEmpty()){
                q.add(t.pollFirst());
            }
            while(!q.isEmpty()) {
                temp=q.pollFirst();
                if (!q.isEmpty()) {
                    temp.next = q.getFirst();
                } else {
                    temp.next = null;
                }
                if (temp.left != null) {
                    t.add(temp.left);
                }
                if (temp.right != null) {
                    t.add(temp.right);
                }
            }
        }
    }

    public static void connect2(TreeLinkNode root){
        while(root!=null){
            TreeLinkNode tmpLevelFirst=new TreeLinkNode(0);
            TreeLinkNode cur=tmpLevelFirst;
            while(root!=null){
                if(root.left!=null){
                    cur.next=root.left;
                    cur = cur.next;
                }
                if (root.right != null) {
                    cur.next = root.right;
                    cur = cur.next;
                }
                root = root.next;
            }
            root = tmpLevelFirst.next;
        }
    }
}
