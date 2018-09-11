import java.util.Arrays;

/**
 * @author Fz
 * @date 2018/9/6 14:14
 */
public class remove_duplicates_from_sorted_array {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,2,2,3,4,5,6}));
    }
    public static int removeDuplicates(int[] A) {
        if(A==null||A.length==0) return 0;
        int res=0;
        for(int i=1;i<A.length;i++){
            if(A[i]!=A[res]){
                A[++res]=A[i];
            }
        }
        return res+1;
    }
}
