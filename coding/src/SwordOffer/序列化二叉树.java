package SwordOffer;

/**
 * @author Fz
 * @date 2018/9/24 14:31
 */
public class 序列化二叉树 {
    public int index = -1;
    String Serialize(TreeNode root) {
        StringBuffer sb = new StringBuffer();
        if(root==null){
            sb.append("#,");
            return sb.toString();
        }
        sb.append(root.val+",");
        sb.append(Serialize(root.left));
        sb.append(Serialize(root.right));
        return sb.toString();
    }
    TreeNode Deserialize(String str) {
       index++;
       int len=str.length();
       if(index>=len){
           return null;
       }
       String[] strings=str.split(",");
       TreeNode node=null;
       if(!strings[index].equals("#")){
           node=new TreeNode(Integer.valueOf(strings[index]));
           node.left=Deserialize(str);
           node.right=Deserialize(str);
       }
       return node;
    }
}
