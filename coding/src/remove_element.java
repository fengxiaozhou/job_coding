import java.util.Iterator;

/**
 * @author Fz
 * @date 2018/9/6 13:50
 */
public class remove_element {
    public int removeElement(int[] A, int elem) {
        if(A==null||A.length==0) return 0;
        int res=0;
        for (int i=0;i<A.length;i++) {
            if(A[i]!=elem) {
                A[res++]=A[i];
            }
        }
        return res;
    }
}
