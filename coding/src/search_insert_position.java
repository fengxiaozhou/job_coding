/**
 * @author Fz
 * @date 2018/9/5 14:30
 */
public class search_insert_position {
    public int searchInsert(int[] A, int target) {
        if(target<A[0]) return 0;
        if(target>A[A.length-1]) return A.length;
        int res=0;
        for(int i=0;i<A.length;i++){
            if(target==A[i]) res=i;
            if(target>A[i]&&target<A[i+1]) res=i+1;
        }
        return res;
    }


    public int searchInsert2(int[] A, int target){
        int low=0;
        int high=A.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            if(target==A[mid]) return mid;
            else if(target>A[mid]) low=mid+1;
            else high=mid-1;
        }
        return low;
    }
}
