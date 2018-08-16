package dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Fz
 * @date 2018/8/16 14:09
 */
public class subsets {
    public ArrayList<ArrayList<Integer>> subsets(int[] S){
        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
        Arrays.sort(S);
        dosubsets(S,0,new ArrayList(),res);

        return res;

    }
    public void dosubsets(int[] S,int index,List path,List<ArrayList<Integer>>res){
        res.add(new ArrayList<>(path));

        for(int i=0;i<S.length;i++){
            path.add(S[i]);
            dosubsets(S,i+1,path,res);
            path.remove(path.size()-1);
        }
    }
}
