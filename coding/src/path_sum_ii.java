import java.util.ArrayList;

/**
 * @author Fz
 * @date 2018/8/17 14:40
 */
public class path_sum_ii {
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        paths(root, sum, list);
        return res;
    }
    private void paths(TreeNode root, int sum, ArrayList<Integer> list){
        if(root == null)
            return;
        if(root.left == null && root.right == null && sum - root.val == 0){
            list.add(root.val);
            res.add(new ArrayList<Integer>(list));
            list.remove(list.size() - 1);
            return;
        }
        list.add(root.val);
        paths(root.left, sum - root.val, list);
        paths(root.right, sum - root.val, list);
        list.remove(list.size() - 1);
    }
}
