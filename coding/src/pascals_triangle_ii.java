import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class pascals_triangle_ii {
    public static void main(String[] args) {
        System.out.println(getRow(3));
    }
    public static ArrayList getRow(int rowIndex) {
        int[] dp=new int[rowIndex+1];
        dp[0]=1;
        for (int i=1;i<=rowIndex;i++){
            for(int j=i;j>=1;j--){
                dp[j]+=dp[j-1];
            }
        }
        ArrayList<Integer> res=new ArrayList();
        for (int a:dp) {
            res.add(a);
         }

        return res;

    }

}
