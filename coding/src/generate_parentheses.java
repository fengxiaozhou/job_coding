import java.util.ArrayList;
import java.util.List;

/**
 * @author Fz
 * @date 2018/9/6 15:03
 */
public class generate_parentheses {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
    public static ArrayList<String> generateParenthesis(int n) {
        ArrayList<String> res=new ArrayList<>();
        if(n==0) return res;
        help(res,"",n,n);
        return res;
    }
    public static void help(ArrayList res,String s,int left,int right){
        if(left>right){
            return;
        }
        if(left==0&&right==0){
            res.add(s);
            return;
        }
        if(left>0) help(res,s+"(",left-1,right);
        if(right>0) help(res,s+")",left,right-1);
    }
}
