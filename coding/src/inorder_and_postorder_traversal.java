/**
 * @author Fz
 * @date 2018/8/17 16:13
 */
public class inorder_and_postorder_traversal {
    public TreeNode build(int[]inorder,int instart,int inend,int[] postorder,int poststart,int postend){
        if(instart>inend||poststart>postend)
            return null;
        int val=postorder[postend];
        TreeNode root=new TreeNode(val);
        int index=0;
        for(int i=0;i<=inend;i++){
            if(inorder[i]==val){
                index=i;
            }
        }
        root.left=build(inorder,instart,index-1,postorder,poststart,poststart+index-instart-1);
        root.right=build(inorder,index+1,inend,postorder,poststart+index-instart,postend-1);
        return  root;

    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if ((inorder == null) || (postorder == null) || (inorder.length == 0) || (postorder.length == 0)) {
            return null;
        }
        return build(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }
}
