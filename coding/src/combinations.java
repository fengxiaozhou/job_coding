import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * @author Fz
 * @date 2018/8/29 14:30
 */
public class combinations {
    public static void main(String[] args) {
        System.out.println(combine(4,2));
    }
    public static ArrayList<ArrayList<Integer>> combine(int n, int k) {
            ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
            combine(n,k,1,res,new ArrayList<>());
            return res;
        }

    public static void combine(int n, int k,int start,ArrayList<ArrayList<Integer>> res,ArrayList<Integer> arr){
        if(k==0){
            res.add(arr);
            return ;
        }
        for(int i=start;i<=n;i++){
            ArrayList<Integer> a = new ArrayList<>(arr);
            a.add(i);
            combine(n,k-1,i+1,res,a);
        }

    }
}
