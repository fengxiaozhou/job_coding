import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class spiral_matrix {
    public static void main(String[] args) {
        int[][] m=new int[][]{{1,2},{3,4}};
        ArrayList res=spiralOrder(m);
        System.out.println(res);
    }
    public static ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> res=new ArrayList<Integer>();
        if(matrix==null) return res;
        if(matrix.length==0) return res;
        if(matrix.length==1)
        {
            for (int a:matrix[0]) {
                res.add(a);
            }
            return res;
        }
        if(matrix[0].length==1)
        {
            for (int i=0;i<matrix.length;i++) {
                res.add(matrix[i][0]);
            }
            return res;
        }
        int x=0;
        int y=0;
        int m=matrix.length-1;
        int n=matrix[0].length-1;
        while(x<m||y<n){
            for(int i=y;i<n;i++){
                res.add(matrix[x][i]);
            }
            for(int i=x;i<m;i++){
                res.add(matrix[i][n]);
            }
            for(int i=n;i>y;i--){
                res.add(matrix[m][i]);
            }
            for(int i=m;i>x;i--){
                res.add(matrix[i][y]);
            }
            x++;
            y++;
            m--;
            n--;
        }
        return res;
    }
}
